package com.github.greekpanda.staticproxy;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 07:31
 */
public class TeacherDaoProxy implements ITeacherDao{
    //target object to use interface to composite
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("Proxy is working");
        //link transaction
        target.teach();
        System.out.println("Proxy is commit");
    }
}
