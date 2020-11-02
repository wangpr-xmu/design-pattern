package org.worker.flyweight;


public class VideoMeeting implements Meeting {

    private String meetingNum;

    public VideoMeeting(String meetingNum) {
        this.meetingNum = meetingNum;
    }

    @Override
    public void havingAMeeting() {
        System.out.println("视频会议，会议号：" + meetingNum);
    }
}
