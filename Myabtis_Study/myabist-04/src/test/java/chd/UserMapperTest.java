package chd;

import chd.dao.UserMapper;
import chd.pojo.User;
import chd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author Big_Sea
 * @Date 2022/1/16 9:59
 * @Version 1.0
 */
public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user: users
             ) {
            System.out.println(user);
        }




        sqlSession.close();
    }
}
