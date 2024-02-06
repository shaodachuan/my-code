package com.mybatis.test;

import com.mybatis.mapper.EmpMapper;
import com.mybatis.mapper.UserMapper;
import com.mybatis.pojo.Emp;
import com.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Array;
import java.util.*;

/**
 * 哈哈哈哈
 *
 * @author red2222
 * @date 2023/12/30
 */
public class MybatisTest {

    public SqlSession getSession() throws IOException {
        // 核心配置，输入流
        InputStream ins = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ins);
        // 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        return sqlSession;
    }

    /**
     * 搭建Mybatis后，测试是否能运行
     */
    @Test
    public void test1() throws IOException {
        SqlSession sqlSession = getSession();
        // 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 执行X
        User user = userMapper.selectUserById(2);

        System.out.println(user);
    }


    /**
     * 测试查询
     */
    @Test
    public void test2() throws IOException {
        SqlSession sqlSession = getSession();

        // 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 执行 selectUserById
        User user = userMapper.selectUserById(2);
        System.out.println(user);


        User user1 = new User();
        user1.setId(2);
        User user2 = new User();
        user2.setUsername("admin");
        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);


        // 所有User
        User res = userMapper.getAllUsers(userList);
        System.out.println(res);
    }

    /*
    * -  传参测试       √
    * -  结果映射测试    √
    * */
    @Test
    public void testParam() throws IOException {
        // 1. sessionFactory、Session
        SqlSession sqlSession = getSession();
        // 2. Mapper
        Emp emp = new Emp(null, "张飞", "张飞@qq.com");
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        empMapper.insertEmp(emp);

        System.out.println(emp);
    }

}
