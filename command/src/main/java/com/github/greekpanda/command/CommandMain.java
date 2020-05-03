package com.github.greekpanda.command;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 12:27
 */
public class CommandMain {
    public static void main(String[] args) {

        //创建电灯的接受者
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯的相关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();

        remoteController.setCommands(0, lightOnCommand, lightOffCommand);

        System.out.println("Hit on button");
        remoteController.onButtonWasPushed(0);

        System.out.println("Hit off button");
        remoteController.offButtonWasPushed(0);

        System.out.println("Hit undo button");
        remoteController.undoButtonWasPushed();

        System.out.println("---------------------------------");

        //TV controller
        TVReceiver tvReceiver = new TVReceiver();

        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        remoteController.setCommands(1, tvOnCommand, tvOffCommand);

        System.out.println("Hit tv on button");
        remoteController.onButtonWasPushed(1);

        System.out.println("Hit tv off button");
        remoteController.offButtonWasPushed(1);

        System.out.println("Hit tv undo button");
        remoteController.undoButtonWasPushed();

    }
}
