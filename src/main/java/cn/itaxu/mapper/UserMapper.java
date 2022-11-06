package cn.itaxu.mapper;

import cn.itaxu.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @Description: cn.itaxu.mapper
 * @author: Axu
 * @date:2022/11/6 9:02
 */
public interface UserMapper {

    @Select("select * from users where username=#{name} and password=#{password} and nickname=#{nickName} and " +
            "gender=#{gender}")
    User select(User user);

    @Select("select * from users where username=#{name}")
    User selectByName(String name);

    @Insert("insert into users (username,nickname,gender,password) values(#{name},#{nickName},#{gender},#{password})")
    void add(User user);
}
