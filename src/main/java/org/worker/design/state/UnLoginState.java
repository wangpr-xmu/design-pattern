package org.worker.design.state;

public class UnLoginState extends State {
    @Override
    public void favorite() {
        switchToLogin();
        this.stateContext.getCurrentState().favorite();
    }

    @Override
    public void comment(String comment) {
        switchToLogin();
        this.stateContext.getCurrentState().comment(comment);
    }

    private void switchToLogin() {
        System.out.println("请先登录");
        this.stateContext.setCurrentState(StateContext.LOGINSTATE);
    }
}
