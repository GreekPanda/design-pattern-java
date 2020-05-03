package com.github.greekpanda.template;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 11:26
 */
public class TemplateMain {
    public static void main(String[] args) {

        SoyMilk soyMilk = new RedBeanSoyMilk();
        soyMilk.make();

        SoyMilk peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();
    }
}
