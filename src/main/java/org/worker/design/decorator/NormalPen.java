package org.worker.design.decorator;

/**
 * @author peiru wang
 * @date 2021/8/28
 */
public class NormalPen implements IPen {

    @Override
    public void write(String content) {
        System.out.println(content);
    }
}
