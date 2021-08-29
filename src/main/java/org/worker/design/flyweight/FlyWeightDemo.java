package org.worker.design.flyweight;

/**
 * 享元模式
 * 一种对象池技术，类似于线程池
 */
public class FlyWeightDemo {

    public static void main(String[] args) {

        Meeting meeting = MeetingPool.getMeeting("123456");
        Meeting meeting2 = MeetingPool.getMeeting("123456");

        System.out.println(meeting == meeting2);

        meeting.havingAMeeting();
    }
}
