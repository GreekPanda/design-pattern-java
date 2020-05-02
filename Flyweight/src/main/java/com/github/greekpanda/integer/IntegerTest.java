package com.github.greekpanda.integer;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 07:06
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(127);
        Integer b = new Integer(127);
        Integer c = Integer.valueOf(127);
        Integer d = new Integer(127);

        System.out.println(a.equals(b)); //true
        System.out.println(a == b); //false
        System.out.println(a == c); //true
        System.out.println(a == d); //false
        System.out.println(b == d); //true
        System.out.println(b.hashCode() + "\t" + d.hashCode());
        System.out.println(a.hashCode() + "\t" + c.hashCode());

        Integer e = Integer.valueOf(10000);
        Integer f = new Integer(10000);
        System.out.println(e.equals(f));

        // 200 is bigger than 127, so below is false, from Integer is cache smaller than 127, use flyweight to
        // share, so if Integer is smaller 127, then valueOf is the same.
        Integer g = Integer.valueOf(200);
        Integer h = Integer.valueOf(200);
        System.out.println(g == h);


    }
}
