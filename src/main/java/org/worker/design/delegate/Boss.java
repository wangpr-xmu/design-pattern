package org.worker.design.delegate;

public class Boss {
    public void command(String task, Leader leader) {
        leader.doTask(task);
    }
}
