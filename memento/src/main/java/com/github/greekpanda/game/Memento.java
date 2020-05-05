package com.github.greekpanda.game;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 11:21
 */
public class Memento {
    private Integer vit;
    private Integer def;

    public Memento(Integer vit, Integer def) {
        this.vit = vit;
        this.def = def;
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
