package com.github.greekpanda.templatehook;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 11:41
 */
public class RedBeanSoyMilk extends SoyMilk {
    @Override
    public void addCondiments() {
        System.out.println("加入了红豆");
    }
}
