package com.github.greekpanda.game;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 11:21
 */
public class GameMain {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setDef(100);
        gameRole.setVit(50);

        //与boss战斗前的状态
        System.out.println("大战前的状态");
        gameRole.display();

        //把当前状态保存在CareTaker中
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(gameRole.createMemento());

        //大战
        System.out.println("-------------------");
        System.out.println("大战中的状态");
        gameRole.setVit(30);
        gameRole.setDef(25);
        gameRole.display();

        //大战后，使用备忘录恢复到大战前
        System.out.println("---------------------");
        System.out.println("大战后的状态恢复");
        gameRole.recoverFromMemento(careTaker.getMemento());
        //恢复后的状态
        gameRole.display();
    }
}
