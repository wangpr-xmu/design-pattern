package org.worker.mediator;

public class MediatorClient {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User feichen = new User("feichen", chatRoom);
        User guanrong = new User("guanrong", chatRoom);

        feichen.sendMessage("hi, guanrong");
        guanrong.sendMessage("hello, feichen");
    }
}
