package com.bjpowernode.junit.service;

import com.powernode.junit.service.MathService;
import org.junit.Assert;
import org.junit.Test;

import java.security.PublicKey;


public class MathServiceTest {
@Test
    public void testSum(){
    MathService mathService =new MathService();
    int sum = mathService.sum(1, 2);
    int excepted =3;
    Assert.assertEquals(excepted,sum);
    }
    @Test
    public  void testSub(){
    MathService mathService =new MathService();
        int sub = mathService.sub(3,2);
        int excepted =1;
        Assert.assertEquals(excepted,sub);
    }
}
