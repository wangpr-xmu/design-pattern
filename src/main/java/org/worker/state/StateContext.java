package org.worker.state;

public class StateContext {
    public static final State LOGINSTATE = new LoginState();
    public static final State UNLOGINSTATE = new UnLoginState();

    private State currentState = UNLOGINSTATE;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
