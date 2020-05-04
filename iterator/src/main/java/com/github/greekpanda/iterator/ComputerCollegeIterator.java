package com.github.greekpanda.iterator;

import java.util.Iterator;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 10:18
 */
public class ComputerCollegeIterator implements Iterator {

    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return departments[++position];
    }

    @Override
    public void remove() {

    }
}
