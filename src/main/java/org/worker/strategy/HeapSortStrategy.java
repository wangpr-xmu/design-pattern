package org.worker.strategy;

public class HeapSortStrategy implements ISortStrategy {
    @Override
    public void sort(int[] nums) {
        System.out.println("堆排序");
    }
}
