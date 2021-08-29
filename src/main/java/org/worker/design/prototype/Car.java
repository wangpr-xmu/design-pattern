package org.worker.design.prototype;

import java.lang.reflect.Field;

/**
 * @author peiru wang
 * @date 2021/8/28
 */
public class Car implements Cloneable {

    private int id;
    private String name;

    public void drive() {
        System.out.println("开车");
    }

    @Override
    protected Object clone() {
        Object cloneObj = null;
        try {
            cloneObj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloneObj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
