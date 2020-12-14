package ua.edu.npu.task04;

import java.util.Random;

public class TFig implements TetrisFigure{
    public TFig() {}

    Random r = new Random();

    @Override
    public void create() {
        if (!isSuper(r.nextBoolean())) {
            System.out.println("Creating T-Figure");
        }
        else {
            System.out.println("Creating SUPER T-Figure");
        }
    }

    @Override
    public boolean isSuper(boolean active) {
        return active;
    }
}
