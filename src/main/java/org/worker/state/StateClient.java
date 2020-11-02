package org.worker.state;

public class StateClient {
    public static void main(String[] args) {
        StateContext stateContext = new StateContext();
        State state = new UnLoginState();
        state.setStateContext(stateContext);
        state.favorite();
    }
}
