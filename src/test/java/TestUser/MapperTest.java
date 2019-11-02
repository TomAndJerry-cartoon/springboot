package TestUser;

import com.springboot.App;
import com.springboot.mapper.UserMapper;
import com.springboot.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFind() {
        List<User> users = userMapper.find();

        for (User user : users) {
            System.err.println(user);
        }

    }
}
