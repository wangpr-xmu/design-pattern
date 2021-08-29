package org.worker.design.adapter;

public class Mp4Player implements VideoPlayer {
    @Override
    public void playVideo(String format, String file) {
        if("mp4".equals(format)) {
            System.out.println("播放视频: " + file);
        }
    }
}
