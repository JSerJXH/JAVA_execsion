package com.chd.dao;

import com.chd.pojo.User;
import com.chd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author Big_Sea
 * @Date 2022/1/13 16:50
 * @Version 1.0
 */
public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user:userList) {
            System.out.println(user);

        }
        sqlSession.close();
    }

}
