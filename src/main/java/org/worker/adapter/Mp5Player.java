package org.worker.adapter;

public class Mp5Player implements MyVideoPlayer {
    private MyVideoPlayer myVideoPlayer;

    public Mp5Player(String format) {
        if("mp4".equals(format)) {
            myVideoPlayer = new MyVideoPlayerAdapter(format);
        }
    }

    @Override
    public void playVideo(String format, String file) {
        if("mp4".equals(format)) {
            myVideoPlayer.playVideo(format, file);
        }else if("rmvb".equals(format)){
            System.out.println("播放视频" + file);
        }else {
            throw new RuntimeException("不支持的格式");
        }
    }
}
