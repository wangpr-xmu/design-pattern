package org.worker.design.composite;

/**
 * 文件目录
 */
public abstract class Directory {
    protected String name;

    public Directory(String name) {
        this.name = name;
    }

    public abstract void show();
}
