package com.github.greekpanda.bridge;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 15:55
 */
public class XiaoMi implements Brand {
    @Override
    public void on() {
        System.out.println("XiaoMi is on");
    }

    @Override
    public void shutDown() {
        System.out.println("Xiaomi shutdown");
    }

    @Override
    public void call() {
        System.out.println("xiaomi calls");
    }
}
