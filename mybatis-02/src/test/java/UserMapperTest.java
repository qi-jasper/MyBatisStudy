import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import study.qi.dao.UserMapper;
import study.qi.pojo.User;
import study.qi.utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);


    // 测试根据ID查找用户
    @Test
    public void selectByIDTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);

/*
        这里查出来的password为空，因为User中设置的为password，而数据库中的字段为pwd，所以password为空
        select * from mybatis.user where id = #{id} == select id, name, pwd from user where id = #{id}
        可以改成select id, name, pwd as password from user where id = #{id}

*/
        System.out.println(user);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void Log4jTest() {
        logger.info("info：进入了Log");
        logger.debug("debug：进入了Log");
        logger.error("error：进入了Log");
    }

    @Test
    public void getUserByLimitTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);

        List<User> userList = mapper.getUserByLimit(map);

        for (User user : userList) {
            System.out.println(user);
        }



        sqlSession.commit();
        sqlSession.close();
    }

}
