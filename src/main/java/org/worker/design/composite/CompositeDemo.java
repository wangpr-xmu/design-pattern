package org.worker.design.composite;

/**
 * 组合模式
 * 又称整体部分模式，单个对象和组合对象用相同的接口表示
 * 使客户端对单个对象和组合对象保持相同的处理方式
 */
public class CompositeDemo {

    public static void main(String[] args) {

        Directory f1 = new FileDirectory("f1.doc");
        Directory f2 = new FileDirectory("f2.doc");
        Directory f3 = new FileDirectory("f3.doc");

        FolderDirectory folder = new FolderDirectory("document");
        folder.add(f1);
        folder.add(f2);
        folder.add(f3);

        f1.show();
        folder.show();

    }
}
