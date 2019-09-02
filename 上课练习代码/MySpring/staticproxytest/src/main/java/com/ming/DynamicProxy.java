package com.ming;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 用于生成动态代理对象(反射)
 */
public class DynamicProxy implements InvocationHandler {

    //引入真实的对象
    public Object targetObject;

    //写一个方法，通过反射生成动态代理对象
    public Object createDynamicProxyObjectInstance(Object paramObj){
        this.targetObject = paramObj;
        return Proxy.newProxyInstance(
                this.targetObject.getClass().getClassLoader(),
                this.targetObject.getClass().getInterfaces(),
                this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object resultObj = null;
        try {
            checkSecurity();
            resultObj = method.invoke(this.targetObject,args);
            return resultObj;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return resultObj;
    }

    //横切关注点
    public void checkSecurity(){
        System.out.println("=============checkSecurity()============");
    }
}
