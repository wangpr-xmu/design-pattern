package org.worker.design.strategy;

public class BubbleSortStrategy implements ISortStrategy {
    @Override
    public void sort(int[] nums) {
        System.out.println("冒泡排序");
    }
}
