package org.worker.design.interpreter;

public class MultiInterpreter extends AbstractInterpreter {
    public MultiInterpreter(AlgorithmInterpreter left, AlgorithmInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return this.left.interpreter() * this.right.interpreter();
    }
}
