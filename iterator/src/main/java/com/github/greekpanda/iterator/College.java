package com.github.greekpanda.iterator;

import java.util.Iterator;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 10:27
 */
public interface College {
    String getName();

    void addDepartment(String name, String desc);

    Iterator createIterator();

}
