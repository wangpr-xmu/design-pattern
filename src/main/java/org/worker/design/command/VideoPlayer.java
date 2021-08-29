package org.worker.design.command;

public class VideoPlayer {
    public void play() {
        System.out.println("开始播放");
    }

    public void pause() {
        System.out.println("暂停播放");
    }

    public void stop() {
        System.out.println("停止");
    }

    public void next() {
        System.out.println("下一个");
    }

    public void back() {
        System.out.println("上一个");
    }
}
