package ua.edu.npu.task01;

import java.util.Objects;

public class NumericOperand implements Operand {
    private final Double value;

    private NumericOperand(Double value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Double eval() {
        return value;
    }

    public static NumericOperand fromString(String value) {
        return fromDouble(Double.parseDouble(value));
    }

    public static NumericOperand fromInt(int value) {
        return fromDouble((double) value);
    }

    public static NumericOperand fromDouble(Double value) {
        return new NumericOperand(value);
    }

}
