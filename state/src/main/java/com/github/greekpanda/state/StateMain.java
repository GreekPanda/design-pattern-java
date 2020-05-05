package com.github.greekpanda.state;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 16:17
 */
public class StateMain {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);

        for(int i = 0; i < 300; i++) {
            System.out.println("第 " + (i + 1) + "领奖");
            activity.deductMoney();
            activity.raffle();
        }
    }
}
