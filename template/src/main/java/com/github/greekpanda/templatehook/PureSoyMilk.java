package com.github.greekpanda.templatehook;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 11:48
 */
public class PureSoyMilk extends SoyMilk {
    @Override
    public void addCondiments() {
        //no implement
    }

    @Override
    boolean customWantCondiments() {
        return false;
        //return super.customWantCondiments();
    }
}
