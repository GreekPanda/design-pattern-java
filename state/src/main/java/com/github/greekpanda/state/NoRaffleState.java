package com.github.greekpanda.state;

/**
 * 不能抽奖的情况下，可以扣除积分，但是无法领取奖品
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 16:40
 */
public class NoRaffleState extends State {
    RaffleActivity raffleActivity ;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deductMoney() {
        System.out.println("扣除积分成功可以开始抽奖");
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("扣除积分之后才能开始抽奖！");
        return false;
    }

    @Override
    public void dispensePrice() {
        System.out.println("不能方法奖品！");
    }
}
