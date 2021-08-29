package org.worker.design.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyContainer<T> implements Container<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public void remove(int index) {
        list.remove(index);
    }

    @Override
    public MyIterator<T> getIterator() {
        return new MyIterator<T>() {
            T element;
            int cursor = 0;
            @Override
            public boolean hasNext() {
                return list.size() != cursor;
            }

            @Override
            public T next() {
                return list.get(cursor++);
            }
        };
    }
}
