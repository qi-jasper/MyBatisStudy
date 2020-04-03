import org.apache.ibatis.session.SqlSession;

import org.junit.Test;
import study.qi.dao.UserMapper;
import study.qi.pojo.User;
import study.qi.utils.MybatisUtils;
import java.util.List;

public class UserMapperTest {


    @Test
    public void AnnotationTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        /*List<User> users = mapper.getUsers();

        for (User user : users) {
            // 查询出的password为空，注解无法应用于复杂的环境中
            System.out.println(user);
            System.out.println(user.getId());
        }*/

        /*User qi = mapper.getUserByID(1, "qi");
        System.out.println(qi);*/

        int i = mapper.deleteUser(7);
        System.out.println(i);


        sqlSession.close();
    }



}
