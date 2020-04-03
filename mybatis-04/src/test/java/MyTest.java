import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import study.qi.dao.StudentMapper;
import study.qi.dao.TeacherMapper;
import study.qi.pojo.Student;
import study.qi.pojo.Teacher;
import study.qi.utils.MybatisUtils;

import java.util.List;

public class MyTest {
    private static SqlSession sqlSession = MybatisUtils.getSqlSession();

    @Test
    public void selectTeacher() {
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);

        sqlSession.close();
    }

    @Test
    public void selectStudent() {
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void selectTeacherandStudent() {
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);

        System.out.println(teacher);


        sqlSession.close();
    }
}
