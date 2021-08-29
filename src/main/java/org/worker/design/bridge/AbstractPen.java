package org.worker.design.bridge;

public abstract class AbstractPen implements IPen {

    private IPen iPen;

    public AbstractPen(IPen iPen) {
        this.iPen = iPen;
    }

    @Override
    public void write(String content) {
        iPen.write(content);
    }
}
