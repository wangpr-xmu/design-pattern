package org.worker.design.strategy;

public class SortContext {
    private ISortStrategy iSortStrategy;

    public SortContext(ISortStrategy iSortStrategy) {
        this.iSortStrategy = iSortStrategy;
    }

    public void sort(int[] nums) {
        iSortStrategy.sort(nums);
    }
}
