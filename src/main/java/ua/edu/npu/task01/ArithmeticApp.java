package ua.edu.npu.task01;

    public class ArithmeticApp {

        public static void main(String[] args) {
            // expr =  100 / (10 + (2.5 * 4))
            Operand res = CompositeOperand.divide(
                    NumericOperand.fromInt(100),
                    new PlusExpression(
                            NumericOperand.fromString("10"),
                            CompositeOperand.multiply(
                                    NumericOperand.fromDouble(2.5D),
                                    NumericOperand.fromInt(4))));
            System.out.println(res.eval());
        }
    }







