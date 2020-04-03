package study.qi.dao;

import study.qi.pojo.User;

import java.util.List;
import java.util.Map;

// 等价于mapper
public interface UserMapper {
    // 查询全部用户
    List<User> getUserList();

    // 根据ID查询用户
    User getUserById(int id);

    // insert用户
    int insertUser(User user);

    int addUser(Map<String, Object> map);

    // 修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUser(int id);
}
