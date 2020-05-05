package com.github.greekpanda.memento;


/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 08:20
 */
public class MementoMain {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("状态1 攻击力100");
        careTaker.add(originator.save());
        originator.setState("状态2 攻击力50");
        careTaker.add(originator.save());
        originator.setState("状态3 攻击力25");
        careTaker.add(originator.save());

        //恢复某个状态
        System.out.println("当前状态： " + originator.getState());

        //恢复到状态1
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("恢复状态：" + originator.getState());
    }
}
