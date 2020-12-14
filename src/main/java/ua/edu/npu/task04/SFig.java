package ua.edu.npu.task04;

import java.util.Random;

public class SFig implements TetrisFigure {
    public SFig() {}

    Random r = new Random();

    @Override
    public void create() {
        if (!isSuper(r.nextBoolean())) {
            System.out.println("Creating S-Figure");
        }
        else {
            System.out.println("Creating SUPER S-Figure");
        }
    }

    @Override
    public boolean isSuper(boolean active) {
        return active;
    }
}
