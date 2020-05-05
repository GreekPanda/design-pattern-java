package com.github.greekpanda.chainofresponsibility;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 19:06
 */
public class DepartmentApprover extends Approver {
    @Override
    public void process(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice().compareTo(BigDecimal.valueOf(5000)) <= 1) {
            System.out.println("id " + purchaseRequest.getId() + " is dealing, it's " + this.name);
        } else {
            approver.process(purchaseRequest);
        }
    }

    public DepartmentApprover(String name) {
        super(name);
    }
}
