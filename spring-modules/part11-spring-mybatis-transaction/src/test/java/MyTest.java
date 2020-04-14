import com.larscheng.www.mapper.UserMapper;
import com.larscheng.www.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void select() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        userMapper.selectUserList().forEach(System.out::println);
    }

}
