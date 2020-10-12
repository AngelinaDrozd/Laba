package ua.edu.npu.task05;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer();

        dev.setActivity(new Orks());
        dev.doAct();

        dev.setActivity(new Pegas());
        dev.doAct();

        dev.setActivity(new Trolls());
        dev.doAct();
    }
}
