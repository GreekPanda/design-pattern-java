package com.github.greekpanda.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 11:03
 */
public class ProxyFactory implements MethodInterceptor {
    //维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回一个代理对象
    public Object getInstance() {

        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();

        //2. 设置父类
        enhancer.setSuperclass(target.getClass());

        //3. 设置回调函数
        enhancer.setCallback(this);

        //4. 创建子对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib proxy is starting");
        Object object = (Object) method.invoke(target, objects);
        System.out.println("cglib proxy is invoking");
        return object;

    }
}
