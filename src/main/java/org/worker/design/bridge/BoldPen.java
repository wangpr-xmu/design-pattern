package org.worker.design.bridge;

public class BoldPen implements IPen {
    @Override
    public void write(String content) {
        content = "加粗" + content;
        System.out.println(content);
    }
}
