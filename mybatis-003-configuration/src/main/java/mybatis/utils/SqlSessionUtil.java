package mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class SqlSessionUtil {
    private static  SqlSessionFactory sqlSessionFactory;
        static{
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        public  static SqlSession OpenSession(){
        return sqlSessionFactory.openSession();


    }


//    private  static SqlSession openSession(){
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder =new SqlSessionFactoryBuilder();
//        try {
//            SqlSessionFactory sqlSessionFactory =sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
//            SqlSession sqlSession =sqlSessionFactory.openSession();
//            return  sqlSession;
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
