package org.worker.iterator;

public class IteratorClient {
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
