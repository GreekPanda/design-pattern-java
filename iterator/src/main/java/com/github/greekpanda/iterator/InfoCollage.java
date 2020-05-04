package com.github.greekpanda.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 10:36
 */
public class InfoCollage implements College{
    List<Department> departmentList;

    public InfoCollage() {
        this.departmentList = new ArrayList<>();
        addDepartment("Data safe", "data safe");
        addDepartment("network safe", "network safe");
        addDepartment("server safe", "server safe");
    }

    @Override
    public String getName() {
        return "Info college";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
