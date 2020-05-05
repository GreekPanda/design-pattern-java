package com.github.greekpanda.chainofresponsibility;

import java.math.BigDecimal;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 18:51
 */
public class Main {
    public static void main(String[] args) {

        //creat purchase
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, BigDecimal.valueOf(110000), 1);
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("王院长");
        SchoolApprover schoolApprover = new SchoolApprover("牛付校长");
        PresidentApprover presidentApprover = new PresidentApprover("图院长");


        //处理人要形成环状
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(schoolApprover);
        schoolApprover.setApprover(presidentApprover);
        presidentApprover.setApprover(departmentApprover);

        departmentApprover.process(purchaseRequest);


    }
}
