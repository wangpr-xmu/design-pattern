package org.worker.design.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class MeetingPool {

    private static Map<String, Meeting> map = new ConcurrentHashMap<>();

    public static Meeting getMeeting(String meetingNum) {
        if(!map.containsKey(meetingNum)) {
            map.put(meetingNum, new VideoMeeting(meetingNum));
        }
        return map.get(meetingNum);
    }
}
