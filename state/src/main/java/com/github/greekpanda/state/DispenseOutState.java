package com.github.greekpanda.state;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 17:01
 */
public class DispenseOutState extends State {
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品已经发放完，欢迎下次继续参与");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放完，欢迎下次继续参与");
        return false;
    }

    @Override
    public void dispensePrice() {
        System.out.println("奖品发放完，欢迎下次继续参与");
    }
}
