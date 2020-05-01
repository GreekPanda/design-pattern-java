package com.github.greekpanda.prototype.deepcopy;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 08:34
 */
public class DeepCopyMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.setName("Tom");
        deepProtoType.setDeepCloneableTarget(new DeepCloneableTarget("tommy", "Silly Boy"));

        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.clone();

        //System.out.println(deepProtoType1.getName() + " deepCloneableTarget hashCode: " + deepProtoType1.getDeepCloneableTarget().hashCode());

        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.clone();
        deepProtoType2.setName("Charlie");

        //ystem.out.println(deepProtoType2.getName() + " deepCloneableTarget hashCode: " + deepProtoType2.getDeepCloneableTarget().hashCode());

        //deep clone method2
        DeepProtoType deepProtoType3 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println(deepProtoType1.getName() + " deepCloneableTarget hashCode: " + deepProtoType1.getDeepCloneableTarget().hashCode());
        System.out.println(deepProtoType2.getName() + " deepCloneableTarget hashCode: " + deepProtoType2.getDeepCloneableTarget().hashCode());

    }
}
