package com.chd.mybatis;

import com.chd.mybatis.mapper.ParameterMapper;
import com.chd.mybatis.pojo.User;
import com.chd.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author Big_Sea
 * @Date 2022/3/10 11:22
 * @Version 1.0
 */
public class testPa {
    @Test
    public void test(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
    }
}
