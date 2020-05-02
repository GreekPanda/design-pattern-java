package com.github.greekpanda.facade;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 16:57
 */
public class FacadeMain {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.ready();
        System.out.println("-----------------");
        facade.play();
        System.out.println("------------------");
        facade.close();
    }
}
