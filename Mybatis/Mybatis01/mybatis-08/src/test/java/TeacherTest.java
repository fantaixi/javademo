import com.at.dao.UserMapper;
import com.at.pojo.User;
import com.at.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author fantaixi
 * @create 2021-01-07 4:28
 */
public class TeacherTest {
    @Test
    public void queryUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        //增删改会改变原来的数据，所以必须刷新缓存  update....
        //手动刷新缓存
        sqlSession.clearCache();
        System.out.println("-----------------------");
        sqlSession.close();

        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUserById(1);
        System.out.println(user==user2);//去二级缓存里面找，前提是在同一个mapper
        sqlSession2.close();
    }
}
