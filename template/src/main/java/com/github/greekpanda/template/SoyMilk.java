package com.github.greekpanda.template;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 11:36
 */
public abstract class SoyMilk {
    final void make() {
        select();
        addCondiments();
        soak();
        smash();
    }

    //
    private void select() {
        System.out.println("选择新鲜的黄豆");
    }

    //可以随意添加配料
    public abstract  void addCondiments();

    private  void soak() {
        System.out.println("浸泡三个小时");
    }

    private void smash() {
        System.out.println("黄豆和配料防盗豆浆机中打碎");
    }
}
