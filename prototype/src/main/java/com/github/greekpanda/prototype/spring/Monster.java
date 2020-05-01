package com.github.greekpanda.prototype.spring;

import lombok.Getter;
import lombok.Setter;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 07:47
 */
@Getter
@Setter
public class Monster {
    private Integer id = 10;
    private String name = "Devil";
    private String skill = "Fire";

    public Monster() {

    }

    public Monster(Integer id, String name, String skill) {
        this.id = id;
        this.name = name;
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }
}
