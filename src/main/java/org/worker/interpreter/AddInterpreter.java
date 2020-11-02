package org.worker.interpreter;

public class AddInterpreter extends AbstractInterpreter {
    public AddInterpreter(AlgorithmInterpreter left, AlgorithmInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return this.left.interpreter() + this.right.interpreter();
    }
}
