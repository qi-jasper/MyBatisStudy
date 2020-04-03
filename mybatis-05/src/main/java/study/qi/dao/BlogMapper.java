package study.qi.dao;

import org.apache.ibatis.annotations.Insert;
import study.qi.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    // 插入数据
    int addBlog(Blog blog);

    // 通过if标签查询博客
    List<Blog> queryBlogIf(Map map);

    // 通过choose/when标签查询博客
    List<Blog> queryBlogChoose(Map map);

    // 通过set更新博客、
    int updateBlog(Map map);

}
