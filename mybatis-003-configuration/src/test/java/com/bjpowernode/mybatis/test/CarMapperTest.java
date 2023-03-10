package com.bjpowernode.mybatis.test;


import com.bjpowernode.mybatis.pojo.Car;
import com.bjpowernode.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarMapperTest {
    @Test
    public  void testInsertCarByPOJO(){
        SqlSession sqlSession = SqlSessionUtil.OpenSession();
        // pojo 封装数据
        Car car=new Car(null,"3333","比亚迪唐",31.1,"2023-01-01","新能源");
        sqlSession.insert("yc.insertCar",car);
        //执行sql
        sqlSession.commit();
        sqlSession.close();
    }
    @Test

    public  void testInsertCar(){
        SqlSession sqlSession = SqlSessionUtil.OpenSession();
        Map<String, Object> map =new HashMap<>();
        map.put("carNum","555");
        map.put("brand","比亚迪明");
        map.put("guide_price","23.2");
        map.put("produce_time","2023-11-11");
        map.put("car_type","新能源");
        int count  =sqlSession.insert("yc.insertCar",map);
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public  void  testDeletId(){
        SqlSession sqlSession = SqlSessionUtil.OpenSession();
        int count = sqlSession.delete("yc.deleteById","jjche");
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public  void testUpdateId(){
        SqlSession sqlSession = SqlSessionUtil.OpenSession();
        int count =sqlSession.update("yc.updatePrice","比亚迪唐");
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testSelectOne(){
        SqlSession sqlSession = SqlSessionUtil.OpenSession();
        Object car =sqlSession.selectOne("yc.selectOne","5");
        System.out.println(car);

        sqlSession.close();
    }
    @Test
    public void testSelectAll(){
        SqlSession sqlSession = SqlSessionUtil.OpenSession();
        List cars =sqlSession.selectList("yc.selectAll");
        cars.forEach(car -> System.out.println(car));
        sqlSession.close();
    }
}
