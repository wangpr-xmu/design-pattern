package org.worker.design.interpreter;

import java.util.Stack;

public class Calculator {

    private Stack<AlgorithmInterpreter> stacks = new Stack<>();

    public Calculator(String expression) {
        parse(expression);
    }

    private void parse(String expression) {
        String[] elements = expression.split(" ");
        AlgorithmInterpreter left;
        AlgorithmInterpreter right;

        for(int i = 0; i < elements.length; i++) {
            String operator = elements[i];
            if(isOperator(elements[i])) {
                left = this.stacks.pop();
                right = new NumberInterpreter(Integer.parseInt(elements[++i]));
                AlgorithmInterpreter interpreter = getInterpreterWithOperator(left, right, operator);
                this.stacks.push(interpreter);
            }else {
                stacks.push(new NumberInterpreter(Integer.parseInt(elements[i])));
            }
        }
    }

    private AlgorithmInterpreter getInterpreterWithOperator(AlgorithmInterpreter left, AlgorithmInterpreter right, String operator) {
        switch (operator) {
            case "+":
                return new AddInterpreter(left, right);
            case "-":
                return new SubInterpreter(left, right);
            case "*":
                return new MultiInterpreter(left, right);
            case "/":
                return new DivInterpreter(left, right);
            default:
                return null;
        }
    }

    private boolean isOperator(String element) {
        return "+".equals(element) || "-".equals(element) || "*".equals(element) || "/".equals(element);
    }

    public int calculate() {
        return stacks.pop().interpreter();
    }
}
