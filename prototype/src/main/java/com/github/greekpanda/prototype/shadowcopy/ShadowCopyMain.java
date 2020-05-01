package com.github.greekpanda.prototype.shadowcopy;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 08:03
 */
public class ShadowCopyMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep(3, "Doli", "white");
        Sheep f = new Sheep(4, "tom", "black");
        sheep.setFriend(f);

        Sheep s1 = (Sheep) sheep.clone();
        Sheep s2 = (Sheep) sheep.clone();
        Sheep s3 = (Sheep) sheep.clone();

        // All the friend hashcode are the same
        System.out.println(s1.toString() + " hashcode : " + s1.hashCode() + " friend hashCode: " + s1.getFriend().hashCode());
        System.out.println(s2.toString() + " hashcode : " + s2.hashCode() + " friend hashCode: " + s2.getFriend().hashCode());
        System.out.println(s3.toString() + " hashCode : " + s3.hashCode() + " friend hashCode: " + s3.getFriend().hashCode());
    }
}
