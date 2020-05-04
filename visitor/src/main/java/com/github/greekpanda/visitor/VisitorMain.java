package com.github.greekpanda.visitor;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 07:51
 */
public class VisitorMain {
    public static void main(String[] args) {

        //Create object structure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);

        System.out.println("------------------------");
        Fail fail = new Fail();
        objectStructure.display(fail);

        System.out.println("----------------------------");
        Wait wait = new Wait();
        objectStructure.display(wait);
    }
}
