package org.worker.design.interpreter;

public class SubInterpreter extends AbstractInterpreter {
    public SubInterpreter(AlgorithmInterpreter left, AlgorithmInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return this.left.interpreter() - this.right.interpreter();
    }
}
