package org.worker.bridge;

public class NormalPen implements IPen {
    @Override
    public void write(String content) {
        content = "常规" + content;
        System.out.println(content);
    }
}
