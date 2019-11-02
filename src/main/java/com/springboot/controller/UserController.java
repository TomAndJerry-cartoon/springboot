package com.springboot.controller;

import com.springboot.mapper.UserMapper;
import com.springboot.pojo.User;
import com.zcr.utils.MyJar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/find")
    public String find(Model model){


        List<User> users = userMapper.find();
        model.addAttribute("users",users);
        return "info";
    }
}
