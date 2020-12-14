package ua.edu.npu.task04;

import java.util.Random;

public class LFig implements TetrisFigure{
    public LFig() {}

    Random r = new Random();

    @Override
    public void create() {
        if (!isSuper(r.nextBoolean())) {
            System.out.println("Creating L-Figure");
        }
        else {
            System.out.println("Creating SUPER L-Figure");
        }
    }

    @Override
    public boolean isSuper(boolean active) {
        return active;
    }
}
