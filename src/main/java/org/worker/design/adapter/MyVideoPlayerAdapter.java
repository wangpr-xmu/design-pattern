package org.worker.design.adapter;

/**
 * 适配器类
 * 实现期望的目标接口，并持有需要的已有接口
 */
public class MyVideoPlayerAdapter implements MyVideoPlayer {
    private VideoPlayer videoPlayer;

    public MyVideoPlayerAdapter(String format) {
        if("mp4".equals(format)) {
            videoPlayer = new Mp4Player();
        }
    }

    @Override
    public void playVideo(String format, String file) {
        if("mp4".equals(format)) {
            videoPlayer.playVideo(format, file);
        }
    }
}
