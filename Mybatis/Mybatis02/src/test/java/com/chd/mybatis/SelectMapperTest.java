package com.chd.mybatis;

import com.chd.mybatis.mapper.SelectMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author Big_Sea
 * @Date 2022/3/10 15:07
 * @Version 1.0
 */
public class SelectMapperTest {
    @Test
    public void testGetUserByID() throws IOException {
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);

        //获取SqlSessionFactoryBuilder

        SqlSession sqlSession = ssf.openSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserById(3));}
    }

