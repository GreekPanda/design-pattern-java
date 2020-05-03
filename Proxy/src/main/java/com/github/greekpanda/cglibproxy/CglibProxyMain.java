package com.github.greekpanda.cglibproxy;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 10:53
 */
public class CglibProxyMain {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();

        //调用代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getInstance();

        //执行代理方法
        proxyInstance.teach();
    }
}
