package com.github.greekpanda.dynamicproxy;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 07:45
 */
public class DynamicProxyMain {
    public static void main(String[] args) {

        ITeacherDao target = new TeacherDao();
        //给目标对象创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        //内存中生成的代理对象实例
        System.out.println(proxyInstance.getClass());
        //通过代理对象调用实例方法
        proxyInstance.teach();

        proxyInstance.hello("jack");
    }
}
