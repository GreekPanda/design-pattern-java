package com.github.greekpanda.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 07:50
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成一个代理对象
    public Object getProxyInstance() {
        // class loader 指定当前目标对象使用的类加载器，获取加载器的方法固定
        // interfaces 目标对象实现的接口的类型，使用泛型的方式确认类型
        // h执行目标对象的方法值，会去触发事件处理器的方法，会把当前执行的目标对象方法作为参数传入
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //JDK代理开始
                System.out.println("JDK proxy is staring");
                //Object method.invoke(target, args);
                return method.invoke(target, args);
            }
        });
    }
}
