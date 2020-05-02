package com.github.greekpanda.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 15:56
 */
public class University extends OrgComponent {

    List<OrgComponent> lstOrgComponent = new ArrayList<>();

    @Override
    protected void print() {
        //Print all colleges in university
        System.out.println("University " + getName() + "");
        for(OrgComponent o : lstOrgComponent) {
            o.print();
        }
    }

    public University(String name, String desc) {
        super(name, desc);
    }

    //rewrite add method
    @Override
    protected void add(OrgComponent orgComponent) {
        lstOrgComponent.add(orgComponent);
    }

    //rewrite remove method
    @Override
    protected void remove(OrgComponent orgComponent) {
        lstOrgComponent.remove(orgComponent);
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
