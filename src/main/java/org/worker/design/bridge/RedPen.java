package org.worker.design.bridge;

public class RedPen extends AbstractPen {
    public RedPen(IPen iPen) {
        super(iPen);
    }

    public void write(String content) {
        content = "红色" + content;
        super.write(content);
    }
}
