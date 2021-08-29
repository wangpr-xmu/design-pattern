package org.worker.design.bridge;

public class BluePen extends AbstractPen {

    public BluePen(IPen iPen) {
        super(iPen);
    }

    public void write(String content) {
        content = "绿色" + content;
        super.write(content);
    }
}
