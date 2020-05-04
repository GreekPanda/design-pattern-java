package com.github.greekpanda.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 08:14
 */
public class ObjectStructure {
    private List<Person> lstPerson = new LinkedList<>();
    public void attach(Person p) {
        lstPerson.add(p);
    }

    public void detach(Person p) {
        lstPerson.remove(p);
    }

    public void display(Action action) {
        for(Person p : lstPerson) {
            p.accept(action);
        }
    }
}
