package ua.edu.npu.task01;

public class Addition implements Arithmetic {
    double x;
    double y;
    double c;

    public Addition(double x, double y, double c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    @Override
    public double compute() {
        return (x + y)*c;
    }

    @Override
    public void print() {
        System.out.println("Scope:" + " (" + x + " + " + y + ")" + " * " +c );
    }
}
