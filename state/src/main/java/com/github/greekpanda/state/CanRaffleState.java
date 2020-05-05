package com.github.greekpanda.state;

import java.util.Random;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 16:46
 */
public class CanRaffleState extends State{
    private RaffleActivity activity;


    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经完成扣分，不能重复扣分");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖中");
        Random r = new Random();
        int num = r.nextInt(10);
        if(num ==0) {
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("没有抽中奖品，下次争取");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrice() {
        System.out.println("很遗憾，没有中奖，无奖品");
    }
}
