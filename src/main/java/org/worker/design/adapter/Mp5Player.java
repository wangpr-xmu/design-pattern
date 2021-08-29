package org.worker.design.adapter;

public class Mp5Player implements MyVideoPlayer {
    private MyVideoPlayerAdapter myVideoPlayerAdapter;

    public Mp5Player(String format) {
        if("mp4".equals(format)) {
            myVideoPlayerAdapter = new MyVideoPlayerAdapter(format);
        }
    }

    @Override
    public void playVideo(String format, String file) {
        //提供播放mp4文件的支持
        if("mp4".equals(format)) {
            myVideoPlayerAdapter.playVideo(format, file);
            //播放rmvb格式内置支持
        }else if("rmvb".equals(format)){
            System.out.println("播放视频" + file);
        }else {
            throw new RuntimeException("不支持的格式");
        }
    }
}
