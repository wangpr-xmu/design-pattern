package org.worker.design.iterator;

/**
 * 迭代器模式
 * 提供一种顺序访问容器对象的方法，而又无序暴露集合内部表示
 */
public class IteratorDemo {
    public static void main(String[] args) {
        MyContainer container = new MyContainer();
        container.add("hello");
        container.add("world");
        container.add("feichen");
        MyIterator iterator = container.getIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
