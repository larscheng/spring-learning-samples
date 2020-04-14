import com.larscheng.www.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        userService.update();

    }
}
