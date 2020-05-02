package com.github.greekpanda.composite;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 16:05
 */
public class Department extends OrgComponent {
    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }
}
