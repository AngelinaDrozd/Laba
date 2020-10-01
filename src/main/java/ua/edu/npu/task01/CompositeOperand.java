package ua.edu.npu.task01;

import java.util.Objects;

public class CompositeOperand implements Operand {
    private final Operand root;

    public CompositeOperand(Operand root) {
        this.root = Objects.requireNonNull(root);
    }

    @Override
    public Double eval() {
        return root.eval();
    }

    public static CompositeOperand minus(Operand left, Operand right) {
        return new CompositeOperand(() -> left.eval() - right.eval());
    }

    public static CompositeOperand multiply(Operand left, Operand right) {
        return new CompositeOperand(() -> left.eval() * right.eval());
    }

    public static CompositeOperand divide(Operand left, Operand right) {
        return new CompositeOperand(() -> left.eval() / right.eval());
    }

}
