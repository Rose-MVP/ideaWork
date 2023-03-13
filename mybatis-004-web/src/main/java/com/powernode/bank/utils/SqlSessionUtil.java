package com.powernode.bank.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class SqlSessionUtil {
    private SqlSessionUtil() {
    }

    private static  SqlSessionFactory sqlSessionFactory;
        static{
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//全局的 服务器级别的一个服务器中定义一个即可
    public  static ThreadLocal<SqlSession> local =new ThreadLocal<>();

    /**
     * 获取会话对象
     * @return 会话对象
     */
    public  static SqlSession openSession(){
            SqlSession sqlSession =local.get();
            if (sqlSession==null) {
                sqlSession=sqlSessionFactory.openSession();
                //绑定 SQLSession 对象绑定到当前线程上
                local.set(sqlSession);
            }
        return sqlSession;
    }
    /*
    关闭Sqlsession 对象 (从当前线程上移除Sqlsession对象)
    @param sqlSession
     */
        public  static  void close(SqlSession sqlSession){
            if (sqlSession !=null) {
                //移除sqlsession对象
                //Tomcat 服务器支持线程池 用过的线程对象 t1 可能下一次还会使用这个线程

                local.remove();
            }
        }
}
