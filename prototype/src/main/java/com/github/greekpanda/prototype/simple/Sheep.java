package com.github.greekpanda.prototype.simple;

import lombok.Getter;
import lombok.Setter;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 07:27
 */
@Getter
@Setter
public class Sheep implements Cloneable{
    private Integer age;
    private String name;
    private String color;

    public Sheep(Integer age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    protected Object clone()  {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (Exception e) {
            System.out.println(e);
        }

        return sheep;
    }
}
