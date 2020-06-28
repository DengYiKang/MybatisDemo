package com.yikang;

import com.yikang.dao.BlogMapper;
import com.yikang.model.Blog;
import com.yikang.util.IdUtil;
import com.yikang.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


public class BlogDaoTest {


    @Test
    public void insertTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog=new Blog();
        blog.setId(IdUtil.getId());
        blog.setTitle("第一篇");
        blog.setAuthor("aaa");
        blog.setCreateTime(new Date());
        blog.setViews(1);
        mapper.addBlog(blog);
        blog.setId(IdUtil.getId());
        blog.setTitle("第二篇");
        mapper.addBlog(blog);
        blog.setId(IdUtil.getId());
        blog.setTitle("第三篇");
        mapper.addBlog(blog);
        blog.setId(IdUtil.getId());
        blog.setTitle("第四篇");
        mapper.addBlog(blog);
        sqlSession.close();
    }
    @Test
    public void ifTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("title", "第一篇");
        System.out.println(mapper.queryBlogIf(map));
        sqlSession.close();
    }
    @Test
    public void chooseTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("title", "第一篇");
        map.put("author", "aaa");
        System.out.println(mapper.queryBlogChoose(map));
        sqlSession.close();
    }
    @Test
    public void deleteAll(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        mapper.deleteAll();
        sqlSession.close();
    }
    @Test
    public void foreachTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        map.put("ids", ids);
        System.out.println(mapper.queryBlogByForeach(map));
    }
    @Test
    public void foreach2Test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        System.out.println(mapper.queryBlogByForeach2(ids));
    }

}
