package org.worker.interpreter;

public class DivInterpreter extends AbstractInterpreter {
    public DivInterpreter(AlgorithmInterpreter left, AlgorithmInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return this.left.interpreter() / this.right.interpreter();
    }
}
