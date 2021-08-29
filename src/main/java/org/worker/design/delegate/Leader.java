package org.worker.design.delegate;

public class Leader implements IEmployee {
    @Override
    public void doTask(String task) {
        if("web".equals(task)) {
            new EmployeeA().doTask(task);
        }else if("needing".equals(task)) {
            new EmployeeB().doTask(task);
        }else {
            System.out.println("no fitting person");
        }
    }
}
