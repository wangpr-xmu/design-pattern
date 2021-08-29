package org.worker.design.mediator;

/**
 * 中介者模式
 * 用一个中介对象封装一系列对象的交互
 */
public class MediatorDemo {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User feichen = new User("feichen", chatRoom);
        User guanrong = new User("guanrong", chatRoom);

        feichen.sendMessage("hi, guanrong");
        guanrong.sendMessage("hello, feichen");
    }
}
