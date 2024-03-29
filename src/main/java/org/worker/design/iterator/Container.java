package org.worker.design.iterator;

public interface Container<T> {
    void add(T obj);
    T get(int index);
    void remove(int index);
    MyIterator<T> getIterator();
}
