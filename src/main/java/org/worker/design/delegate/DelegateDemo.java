package org.worker.design.delegate;

/**
 * 委派模式
 * 负责任务的调度和分配，将任务的分配和执行分离开来
 */

public class DelegateDemo {
    public static void main(String[] args) {
        new Boss().command("web", new Leader());
        new Boss().command("needing", new Leader());
        new Boss().command("nothing", new Leader());
    }
}
