package com.github.greekpanda.chainofresponsibility;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 19:00
 */
public class PurchaseRequest {
    //请求类型
    private Integer type;

    private BigDecimal price = new BigDecimal(0.0);

    private Integer id = 0;

    public PurchaseRequest(Integer type,BigDecimal price, Integer id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
