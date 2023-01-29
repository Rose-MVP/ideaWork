package com.bjpowernode.mybatis.test;

import com.bjpowernode.mybatis.pojo.Car;
import com.bjpowernode.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CarMapperTest {
    @Test
    public  void testInsertCarByPOJO(){
        SqlSession sqlSession = SqlSessionUtil.OpenSession();
        //封装数据
        Car car=new Car(null,"3333","比亚迪唐",31.1,"2023-01-01","新能源");
        sqlSession.insert("insertCar",car);
        //执行sql
        sqlSession.commit();
        sqlSession.close();
    }
//    @Test
//    public  void testInsertCar(){
//        SqlSession sqlSession = SqlSessionUtil.OpenSession();
//        Map<String, Object> map =new HashMap<>();
//        map.put("carNum","555");
//        map.put("brand","比亚迪明");
//        map.put("guide_price","23.2");
//        map.put("produce_time","2023-11-11");
//        map.put("car_type","新能源");
//        int count  =sqlSession.insert("insertCar",map);
//        System.out.println(count);
//        sqlSession.commit();
//        sqlSession.close();
//    }
}
