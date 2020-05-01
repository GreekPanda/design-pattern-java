package com.github.greekpanda.prototype.deepcopy;

import java.io.Serializable;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 08:20
 */
public class DeepCloneableTarget implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCloneableTarget deepCloneableTarget = (DeepCloneableTarget) super.clone();
        return deepCloneableTarget;
    }
}
