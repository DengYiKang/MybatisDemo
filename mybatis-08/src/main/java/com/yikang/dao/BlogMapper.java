package com.yikang.dao;

import com.yikang.model.Blog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface BlogMapper {

    int addBlog(@Param("blog") Blog blog);

    int updateBlog(@Param("blog") Blog blog);

    List<Blog> queryBlogByForeach(Map map);

    List<Blog> queryBlogByForeach2(@Param("ids") ArrayList<Integer> ids);

    List<Blog> queryBlogIf(Map map);

    List<Blog> queryBlogChoose(Map map);

    @Delete("delete from blog where 1 = 1")
    void deleteAll();
}

