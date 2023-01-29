package com.bjpowernode.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

public class ConfigurationTest {
    @Test
    public  void testEnvironment(){
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder =new SqlSessionFactoryBuilder();
        try {
            SqlSessionFactory sqlSessionFactory =sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("config"),"powernodeDB");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
