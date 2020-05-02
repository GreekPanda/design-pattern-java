package com.github.greekpanda.decorator;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 08:39
 */
public class DecoratorMain {
    public static void main(String[] args) {

        //Want a longblack coffee
        Drink order  = new LongBlack();
        System.out.println("It's " + order.getDescription() + "\t" + " price " + order.cost());

        //add milk
        order = new Milk(order);
        System.out.println("A new order with milk: " + order.getDescription() + "\t" + " price " + order.cost());

        //add chocolate
        order = new Chocolate(order);
        System.out.println("Add chocolate: " + order.getDescription() + "\t" + " price " + order.cost());
    }
}
