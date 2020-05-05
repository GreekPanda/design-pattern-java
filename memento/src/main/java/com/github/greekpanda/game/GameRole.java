package com.github.greekpanda.game;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 11:22
 */
public class GameRole {
    private Integer vit;
    private Integer def;

    public Memento createMemento() {
        return new Memento(vit, def);
    }

    public void recoverFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    public void display() {
        System.out.println("Game role current vit: " + vit + " \t def: " + def);
    }

    public Integer getVit() {
        return vit;
    }

    public void setVit(Integer vit) {
        this.vit = vit;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }
}
