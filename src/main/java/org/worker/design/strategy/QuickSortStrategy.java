package org.worker.design.strategy;

public class QuickSortStrategy implements ISortStrategy {
    @Override
    public void sort(int[] nums) {
        System.out.println("快速排序");
    }
}
