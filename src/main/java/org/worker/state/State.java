package org.worker.state;

public abstract class State {
    protected StateContext stateContext;

    public void setStateContext(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    public abstract void favorite();
    public abstract void comment(String comment);
}
