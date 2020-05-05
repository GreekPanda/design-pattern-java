package com.github.greekpanda.chainofresponsibility;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 19:03
 */
public abstract class Approver {
    Approver approver;
    //next
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void process(PurchaseRequest purchaseRequest);
}
