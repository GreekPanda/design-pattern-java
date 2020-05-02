package com.github.greekpanda.facade;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 16:34
 */
public class Facade {
    private Light light;
    private PopCorn popCorn;
    private DVDPlayer dvdPlayer;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;

    public Facade() {
        this.light = light.getInstance();
        this.popCorn = popCorn.getInstance();
        this.dvdPlayer = dvdPlayer.getInstance();
        this.stereo = stereo.getInstance();
        this.projector = projector.getInstance();
        this.screen = screen.getInstance();
    }

    public void ready() {
        popCorn.on();
        popCorn.pop();
        screen.down();
        projector.on();
        stereo.up();
        light.dim();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void close() {
        popCorn.off();
        light.bright();
        screen.up();
        projector.off();
        stereo.down();
        dvdPlayer.off();
    }

}
