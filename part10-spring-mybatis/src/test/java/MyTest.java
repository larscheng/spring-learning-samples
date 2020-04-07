import com.larscheng.www.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    /***
     * 方式1
     */
    @Test
    public void select() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        userMapper.selectUserList().forEach(System.out::println);
    }

    /**
     * 方式2
     */
    @Test
    public void select2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao2.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        userMapper.selectUserList().forEach(System.out::println);
    }
}
