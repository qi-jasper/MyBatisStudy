package study.qi.dao;

import study.qi.pojo.User;

import java.util.List;
import java.util.Map;

// 等价于mapper
public interface UserMapper {

    // 根据ID查询用户
    User getUserById(int id);


    // 分页查询
    List<User> getUserByLimit(Map<String, Integer> map);
}
