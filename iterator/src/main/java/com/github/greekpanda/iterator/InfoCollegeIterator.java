package com.github.greekpanda.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 10:24
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> infoCollegeIteratorList = new ArrayList<>();
    int index = -1;

    public InfoCollegeIterator(List<Department> infoCollegeIteratorList) {
        this.infoCollegeIteratorList = infoCollegeIteratorList;
    }

    @Override
    public boolean hasNext() {
        if(index >= infoCollegeIteratorList.size()) {
            return false;
        } else {
            index++;
            return true;
        }
    }

    @Override
    public Object next() {

        return infoCollegeIteratorList.get(index);
    }

    @Override
    public void remove() {

    }
}
