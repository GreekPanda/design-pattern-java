package com.github.greekpanda.composite;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 15:36
 */
public class CompositeMain {
    public static void main(String[] args) {
        //From the whole to parts
        OrgComponent u = new University("TsingHua", "top1");

        //create college
        OrgComponent csCollege = new College("cs", "1st");
        OrgComponent eiCollege = new College("ei", "2nd");

        //create department
        csCollege.add(new Department("soft engineer", "good"));
        csCollege.add(new Department("network", "not bad"));
        csCollege.add(new Department("cs", "tradition"));

        //create ei department
        eiCollege.add(new Department("tel", "difficult"));
        eiCollege.add(new Department("i-project", "easy"));

        //add colleges into u
        u.add(csCollege);
        u.add(eiCollege);

        u.print();
    }
}
