package com.github.greekpanda.prototype.simple;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 06:56
 * Spring在bean的创建中使用了原型模式
 */
@SpringBootApplication
public class PrototypeMain {
    public static void main(String[] args) {
        System.out.println("Test from ptyd");

        Sheep sheep = new Sheep(3, "Doli", "while");
        Sheep s1 = (Sheep) sheep.clone();
        Sheep s2 = (Sheep) sheep.clone();
        Sheep s3 = (Sheep) sheep.clone();

        System.out.println(s1 + " hashCode = " + s1.hashCode());
        System.out.println(s2 + " hashCode = " + s2.hashCode());
        System.out.println(s3 + " hashCode ="  + s3.hashCode());

    }
}
