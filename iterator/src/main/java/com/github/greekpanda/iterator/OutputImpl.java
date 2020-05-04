package com.github.greekpanda.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 10:40
 */
public class OutputImpl {
    //学院集合
    List<College> collegeList = new ArrayList<>();

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //打印学院
    public void printCollege() {
       Iterator<College> collegeIterator = collegeList.iterator();
       while (collegeIterator.hasNext()) {
           //取出学院
           College college = collegeIterator.next();
           System.out.println("College name " + college.getName());
           printDepartment(collegeIterator);
       }

    }

    //学院输出系
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println("department name: " + d.getName());
        }
    }
}
