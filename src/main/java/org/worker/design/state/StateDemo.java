package org.worker.design.state;

/**
 * 状态模式
 * 对象在内部状态发生改变时改变它的行为
 */
public class StateDemo {
    public static void main(String[] args) {
        StateContext stateContext = new StateContext();
        State state = new UnLoginState();
        state.setStateContext(stateContext);
        state.favorite();
    }
}
