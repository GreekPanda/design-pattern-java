package com.github.greekpanda.staticproxy;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 07:36
 */
public class StaticProxyMain {
    public static void main(String[] args) {
        //被代理对象
        TeacherDao target = new TeacherDao();
        //代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(target);

        //执行的是代理对象的方法
        teacherDaoProxy.teach();

    }
}
