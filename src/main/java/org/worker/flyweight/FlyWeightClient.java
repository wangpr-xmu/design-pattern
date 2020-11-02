package org.worker.flyweight;

public class FlyWeightClient {
    public static void main(String[] args) {
        Meeting meeting = MeetingFactory.getMeeting("123456");
        meeting.havingAMeeting();
    }
}
