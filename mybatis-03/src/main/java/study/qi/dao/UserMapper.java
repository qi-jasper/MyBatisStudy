package study.qi.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import study.qi.pojo.User;

import java.util.List;


public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    // 方法存在多个参数，所有的参数前面必须加上@Param(),@Select()注解中接受的id和name的参数以@Param()中的参数为主
    @Select("select * from user where id=#{id} and name=#{name}")
    User getUserByID(@Param("id") int id, @Param("name") String name);

    @Delete("delete from user where id=#{id}")
    int deleteUser(@Param("id") int id);


}
