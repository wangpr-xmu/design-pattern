package org.worker.design.composite;

/**
 * 文件
 */
public class FileDirectory extends Directory {

    public FileDirectory(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
