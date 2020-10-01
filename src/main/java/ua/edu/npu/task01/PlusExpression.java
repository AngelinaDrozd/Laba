package ua.edu.npu.task01;

import java.util.Objects;

public class PlusExpression implements Operand {
    private final Operand left;
    private final Operand right;

    public PlusExpression(Operand left, Operand right) {
        this.left = Objects.requireNonNull(left);
        this.right = Objects.requireNonNull(right);
    }

    @Override
    public Double eval() {
        return left.eval() + right.eval();
    }
}
