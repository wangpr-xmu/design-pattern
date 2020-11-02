package org.worker.mediator;

public class ChatRoom {
    public void showMessage(User user, String msg) {
        System.out.println(user.getName() + ": " + msg);
    }
}
