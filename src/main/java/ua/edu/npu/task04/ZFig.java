package ua.edu.npu.task04;

import java.util.Random;

public class ZFig implements TetrisFigure{
    public ZFig() {}

    Random r = new Random();

    @Override
    public void create() {
        if (!isSuper(r.nextBoolean())) {
            System.out.println("Creating Z-Figure");
        }
        else {
            System.out.println("Creating SUPER Z-Figure");
        }
    }

    @Override
    public boolean isSuper(boolean active) {
        return active;
    }
}
