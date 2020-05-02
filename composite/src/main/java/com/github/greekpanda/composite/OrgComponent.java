package com.github.greekpanda.composite;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 15:46
 */
public abstract class OrgComponent {
    private String name;
    private String desc;

    protected void add(OrgComponent orgComponent) {
        //default method
        throw new UnsupportedOperationException();
    }

    protected void remove(OrgComponent orgComponent) {
        throw new UnsupportedOperationException();
    }

    protected abstract void print();

    public OrgComponent(String name, String desc) {
        super();
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
