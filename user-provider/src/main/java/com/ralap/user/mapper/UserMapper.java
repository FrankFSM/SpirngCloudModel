package com.ralap.user.mapper;

import com.ralap.user.domain.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by ralap on 2017/11/2.
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    public User getUserById(long id);

    @Select("select * from user")
    List<User> getAllUser();
}
