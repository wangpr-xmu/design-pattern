package org.worker.delegate;

public class EmployeeB implements IEmployee {
    private String goodAt = "communicating";
    @Override
    public void doTask(String task) {
        System.out.println("I am good at " + goodAt + ", I am doing" + task);
    }
}
