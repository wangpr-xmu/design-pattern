package org.worker.design.interpreter;

public abstract class AbstractInterpreter implements AlgorithmInterpreter {
    protected AlgorithmInterpreter left;
    protected AlgorithmInterpreter right;

    public AbstractInterpreter(AlgorithmInterpreter left, AlgorithmInterpreter right) {
        this.left = left;
        this.right = right;
    }
}
