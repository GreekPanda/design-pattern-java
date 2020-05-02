package com.github.greekpanda.flyweight;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 06:46
 */
public class ConcreteWebSite  extends WebSite{
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    protected void use(User user) {
        System.out.println("Web site content " + type + "\t" + "User is " + user.getName());
    }
}
