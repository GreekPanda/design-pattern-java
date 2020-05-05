package com.github.greekpanda.chainofresponsibility;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 19:15
 */
public class PresidentApprover extends Approver{
    public PresidentApprover(String name) {
        super(name);
    }

    @Override
    public void process(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice().compareTo(BigDecimal.valueOf(30000)) > 1
                && purchaseRequest.getPrice().compareTo(BigDecimal.valueOf(50000)) <= 1 ) {
            System.out.println("id: " + purchaseRequest.getId() + " it's " + this.name);
        } else {
            System.out.println("no one can deal it");
        }
    }
}
