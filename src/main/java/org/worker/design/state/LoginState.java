package org.worker.design.state;

public class LoginState extends State {
    @Override
    public void favorite() {
        System.out.println("收藏成功");
    }

    @Override
    public void comment(String comment) {
        System.out.println("评论：" + comment);
    }
}
