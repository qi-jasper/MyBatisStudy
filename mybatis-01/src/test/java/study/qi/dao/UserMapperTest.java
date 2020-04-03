package study.qi.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import study.qi.pojo.User;
import study.qi.utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {

    // 测试查找数据库中一个表的所有元素
    @Test
    public void selectTest() {
        // 1. 获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 2. 执行sql
        // 方式一：getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();

        for(User user : userList) {
            System.out.println(user);
        }

        // 关闭sqlsession
        sqlSession.close();
    }

    // 测试根据ID查找用户
    @Test
    public void selectByIDTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    // 测试插入
    // 注意：增删改需要提交事务！！！
    @Test
    public void insertTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.insertUser(new User(3, "gg", "1234"));

        // 提交事务
        sqlSession.commit();

        // 关闭
        sqlSession.close();
    }


    @Test
    public void addUser2Test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userid", 7);
        map.put("userName", "hello");
        map.put("pwd", "hhh");


        mapper.addUser(map);

        sqlSession.commit();
        sqlSession.close();
    }
}
