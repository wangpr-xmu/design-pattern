package org.worker.design.strategy;

/**
 * 策略模式
 * 封装一组可以解决相同问题的算法，让他们之间可以互相替换
 */
public class StrategyDemo {
    public static void main(String[] args) {
        SortContext sortContext = new SortContext(new BubbleSortStrategy());
        sortContext.sort(new int[]{1,2});
    }
}
