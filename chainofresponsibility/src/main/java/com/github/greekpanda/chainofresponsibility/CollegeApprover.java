package com.github.greekpanda.chainofresponsibility;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 19:10
 */
public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void process(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice().compareTo(BigDecimal.valueOf(5000))> 1
                && purchaseRequest.getPrice().compareTo(BigDecimal.valueOf(10000)) <= 1) {
            System.out.println("id :" + purchaseRequest.getId() + " ,  it's : " + this.name);
        } else {
            this.process(purchaseRequest);
        }
    }
}
