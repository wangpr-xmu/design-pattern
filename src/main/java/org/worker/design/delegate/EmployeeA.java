package org.worker.design.delegate;

public class EmployeeA implements IEmployee {
    private String goodAt = "coding";

    @Override
    public void doTask(String task) {
        System.out.println("I am good at " + goodAt + ", I am doing" + task);
    }
}
