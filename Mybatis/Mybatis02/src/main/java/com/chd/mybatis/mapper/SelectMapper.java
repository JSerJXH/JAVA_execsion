package com.chd.mybatis.mapper;

import com.chd.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Big_Sea
 * @Date 2022/3/10 15:03
 * @Version 1.0
 */
public interface SelectMapper {

    /*
    * 根据id查询用户信息
    * */

    User getUserById(@Param("id") Integer id);
}
