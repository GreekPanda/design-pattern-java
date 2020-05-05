package com.github.greekpanda.state;

/**
 *  抽象类在子类实现
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 16:37
 */
public abstract class State {
    //扣除积分
    public abstract void deductMoney();

    //是否抽中奖品
    public abstract boolean raffle();

    //发放奖品
    public abstract void dispensePrice();
}
