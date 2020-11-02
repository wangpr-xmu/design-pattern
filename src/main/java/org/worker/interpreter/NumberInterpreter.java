package org.worker.interpreter;

public class NumberInterpreter implements AlgorithmInterpreter {
    private int value;

    public NumberInterpreter(int value) {
        this.value = value;
    }

    @Override
    public int interpreter() {
        return this.value;
    }
}
