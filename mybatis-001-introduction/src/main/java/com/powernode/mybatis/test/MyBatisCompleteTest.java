package com.powernode.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class MyBatisCompleteTest {
    public static void main(String[] args) {
        SqlSession sqlSession=null;
        try {
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder =new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
            sqlSession =sqlSessionFactory.openSession();
            //执行sql语句
            int count = sqlSession.insert("insertCar");
            System.out.println(count);
            //提交事务 终止事务
            sqlSession.commit();
        } catch (IOException e) {
        if(sqlSession!=null){
            sqlSession.rollback();
        }
        e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
