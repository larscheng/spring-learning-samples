
import com.larscheng.www.pojo.Books;
import com.larscheng.www.service.BooksService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class BooksServiceTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService booksService = con.getBean("booksService", BooksService.class);
        List<Books> books = booksService.queryAllBook();
        books.forEach(a-> System.out.println(a.toString()));
    }
}