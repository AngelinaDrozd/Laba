package ua.edu.npu.task01;

public class Main {
    public static void main(String[] args) {
        Arithmetic a1 = new Addition(10, 25, 4);
        Arithmetic a2 = new Addition(3, 9, 52);
        a1.print();
        a2.print();
        Arithmetic res = new CompositeAddition(a1, a2);
        System.out.println("Adding two scopes: " + res.compute());
    }
}
