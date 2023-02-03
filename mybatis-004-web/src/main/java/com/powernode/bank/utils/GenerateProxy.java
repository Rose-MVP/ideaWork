package com.powernode.bank.utils;
//mybatis 号称轻量级，只需要一个jar包就搞定

import org.apache.ibatis.javassist.CannotCompileException;
import org.apache.ibatis.javassist.ClassPool;
import org.apache.ibatis.javassist.CtClass;
import org.apache.ibatis.javassist.CtMethod;

import java.lang.reflect.Method;
import java.util.Arrays;

public class GenerateProxy {
    public  static  Object generate(Class daoInterface){
        ClassPool pool =ClassPool.getDefault();
        //制造类
        CtClass ctClass = pool.makeClass(daoInterface.getName()+"proxy");
        //制造接口
        CtClass ctInterface = pool.makeInterface(daoInterface.getName());
        //实现接口
        ctClass.addInterface(ctInterface);
        //实现接口的所有方法
        Method[] methods =daoInterface.getDeclaredMethods();
        Arrays.stream(methods).forEach(method -> {
            //method 接口中的
            //impl
            CtMethod ctMethod = null;
            try {
                //Account selectByActno(String actno);
                //public Account selectByActno(String actno){ }
                StringBuilder methodCode = new StringBuilder();
                methodCode.append("public ");
                methodCode.append(method.getReturnType().getName());
                methodCode.append(" ");
                methodCode.append(method.getName());
                methodCode.append("(");
                //需要的方法的形式参数的列表
                Class<?>[] parameterTypes = method.getParameterTypes();
                for (int i = 0; i < parameterTypes.length; i++) {
                    Class<?> parameterType = parameterTypes[i];
                    methodCode.append(parameterType.getName());
                    methodCode.append(" ");
                    methodCode.append("arg"+i);
                    if (i != parameterTypes.length-1){
                        methodCode.append(",");
                    }
                }
                methodCode.append(")");
                methodCode.append("{");
                //需要方法体中的代码

                methodCode.append("}");
                ctMethod = CtMethod.make(methodCode.toString(), ctClass);
                ctClass.addMethod(ctMethod);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        //创建对象
        Object o=null;
        try {
            Class<?> aClass = ctClass.toClass();
             o = aClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  o;
    }
}
