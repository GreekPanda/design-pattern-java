package com.github.greekpanda.interfaceadapter;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 14:55
 */
public class InterfaceAdapterMain {
    public static void main(String[] args) {
       AbsAdapter absAdapter = new AbsAdapter() {
           @Override
           public void m1() {
               super.m1();
           }
       };

    }
}
