package study.qi.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import study.qi.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {

    @Select("select * from teacher where id=#{id}")
    Teacher getTeacher(@Param("id") int id);

    // 获取老师
//    List<Teacher> getTeacher();

//    Teacher getTeacher(@Param("tid") int id);

}
