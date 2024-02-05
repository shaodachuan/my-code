package com.mybatis.test;

import com.mybatis.mapper.EmpMapper;
import com.mybatis.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 哈哈哈哈
 *
 * @author red2222
 * @date 2024/2/5
 */
public class EmpTest {

    @Test
    public void testEmpById() throws IOException {
        // 1. SqlSessioNFactory
        InputStream ins = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ins);
        // 2. SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 3. Mapper
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Emp empById = empMapper.getEmpAlias(1);
        System.out.println(empById);
    }
}
