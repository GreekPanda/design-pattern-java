package com.github.greekpanda.visitor;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 08:52
 */
public class Wait extends Action {
    @Override
    public void getManResult(Man main) {
        System.out.println("Man's wait");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Woman's wait");
    }
}
