import com.larscheng.www.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationbeans.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        userService.update();

    }
}
