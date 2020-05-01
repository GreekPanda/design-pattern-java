package com.github.greekpanda.prototype.shadowcopy;

import lombok.Getter;
import lombok.Setter;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 08:04
 */
@Getter
@Setter
public class Sheep implements Cloneable{
    private Integer age = 2;
    private String name = "Doli";
    private String color = "white";
    private Sheep friend;

    public Sheep() {
    }

    public Sheep(Integer age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public Sheep(Integer age, String name, String color, Sheep friend) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public Sheep getFriend() {
        return friend;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();
        return sheep;
    }
}
