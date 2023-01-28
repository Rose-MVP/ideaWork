package com.powernode.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.sql.Connection;

public class MyBatisIntroductionTest {
    public static void main(String[] args) throws  Exception{
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder =new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        int count=sqlSession.insert("insertCar");
        System.out.println("插入了："+count+"条记录");
        sqlSession.commit();
    }
}
