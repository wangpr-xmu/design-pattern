package org.worker.adapter;

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
