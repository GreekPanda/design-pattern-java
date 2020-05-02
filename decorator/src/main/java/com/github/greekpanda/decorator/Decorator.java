package com.github.greekpanda.decorator;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 08:52
 */
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    public Drink getObj() {
        return obj;
    }

    public void setObj(Drink obj) {
        this.obj = obj;
    }

    @Override
    public BigDecimal cost() {
        //get self price & get other price
        return super.getPrice().add(obj.getPrice());
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public void setPrice(BigDecimal price) {
        super.setPrice(price);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\t" + obj.getPrice() + "\t" + obj.getDescription();
    }
}
