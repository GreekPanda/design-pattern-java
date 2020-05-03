package com.github.greekpanda.staticproxy;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 07:31
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("Teacher is teaching");
    }
}
