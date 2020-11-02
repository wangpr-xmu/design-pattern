package org.worker.strategy;

public class StrategyClient {
    public static void main(String[] args) {
        SortContext sortContext = new SortContext(new BubbleSortStrategy());
        sortContext.sort(new int[]{1,2});
    }
}
