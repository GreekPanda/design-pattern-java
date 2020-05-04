package com.github.greekpanda.iterator;

import java.util.Iterator;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 10:30
 */
public class ComputerCollege implements College{

    Department[] departments;
    //保存当前数组的
    int numOfDepartment;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java", "Java");
        addDepartment("C++", "C++");
        addDepartment("python", "python");
        addDepartment("BigData", "BigData");
        addDepartment("Php", "php");
    }

    @Override
    public String getName() {
        return "Computer college";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(this.departments);
    }
}
