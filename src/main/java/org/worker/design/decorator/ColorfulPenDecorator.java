package org.worker.design.decorator;

/**
 * @author peiru wang
 * @date 2021/8/28
 */
public class ColorfulPenDecorator implements IPen {

    private IPen pen;
    private String color;

    public ColorfulPenDecorator(IPen pen, String color) {
        this.pen = pen;
        this.color = color;
    }

    @Override
    public void write(String content) {
        content = content + "(" + color + ")";
        pen.write(content);
    }
}
