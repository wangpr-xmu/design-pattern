package org.worker.component;

public class FileDirectory extends Directory {
    public FileDirectory(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
