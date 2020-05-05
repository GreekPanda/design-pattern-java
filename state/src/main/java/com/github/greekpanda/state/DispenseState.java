package com.github.greekpanda.state;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 16:55
 */
public class DispenseState extends State {
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣除积分，不能重复扣除");
    }

    @Override
    public boolean raffle() {
        System.out.println("已经领取奖品，不能抽奖");
        return false;
    }

    @Override
    public void dispensePrice() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖！");
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("很遗憾，奖品已经发放完成");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
