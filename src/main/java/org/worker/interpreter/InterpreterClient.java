package org.worker.interpreter;

public class InterpreterClient {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("2 + 2 - 1");
        System.out.println(calculator.calculate());
    }
}
