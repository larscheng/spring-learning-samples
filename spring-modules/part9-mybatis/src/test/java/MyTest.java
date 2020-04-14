import com.larscheng.www.mapper.UserMapper;
import com.larscheng.www.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void select() throws IOException {
        //获取数据源配置
        String xml = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(xml);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUserList();
        users.forEach(System.out::println);

    }
}
