package com.github.greekpanda.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 16:02
 */
public class College extends OrgComponent {

    //store all departments
    List<OrgComponent> lstOrgComponent = new ArrayList<>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrgComponent orgComponent) {
        super.add(orgComponent);
    }

    @Override
    protected void remove(OrgComponent orgComponent) {
        super.remove(orgComponent);
    }

    @Override
    protected void print() {

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
