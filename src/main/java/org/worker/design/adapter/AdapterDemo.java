package org.worker.design.adapter;

/**
 * 适配器模式
 * 把一个类的接口变成客户端所期望的另一种接口，
 * 从而使原本因接口不匹配而导致无法在一起工作的两个类能够一起工作
 * @author peiru wang
 * @date 2021/8/27
 */
public class AdapterDemo {
    public static void main(String[] args) {
        Mp5Player mp5Player = new Mp5Player("mp4");

        mp5Player.playVideo("mp4", "The Matrix");
    }
}
