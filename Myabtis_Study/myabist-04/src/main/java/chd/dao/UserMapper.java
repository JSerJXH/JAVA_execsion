package chd.dao;



import chd.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author Big_Sea
 * @Date 2022/1/14 11:44
 * @Version 1.0
 */
public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();

}
