package com.github.greekpanda.bridge;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 15:56
 */
public class Vivo implements Brand {
    @Override
    public void on() {
        System.out.println("vivo is on");
    }

    @Override
    public void shutDown() {
        System.out.println("vivo shutdown");
    }

    @Override
    public void call() {
        System.out.println("vivo calls");
    }
}
