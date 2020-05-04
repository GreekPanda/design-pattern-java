package com.github.greekpanda.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 09:00
 */
public class IteratorMain {
    public static void main(String[] args) {
        //Iterator
        List<College> collegeList = new ArrayList<>();
        //
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollage infoCollage = new InfoCollage();

        collegeList.add(computerCollege);
        //collegeList.add(infoCollage);

        Iterator itr = collegeList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();
    }
}
