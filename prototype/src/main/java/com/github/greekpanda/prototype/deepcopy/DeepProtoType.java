package com.github.greekpanda.prototype.deepcopy;

import java.io.*;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 08:25
 */
public class DeepProtoType implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
    }

    public DeepProtoType(String name, DeepCloneableTarget deepCloneableTarget) {
        this.name = name;
        this.deepCloneableTarget = deepCloneableTarget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    // method-1: deep copy use clone method

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = null;
        o = super.clone();
        DeepProtoType deepProtoType = (DeepProtoType) o;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    //method-2: serialize object to
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        bos = new ByteArrayOutputStream();
        try {
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // write current object into it

            //deserialize

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType deepProtoType = (DeepProtoType) ois.readObject();
            return deepProtoType;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return null;
    }


}
