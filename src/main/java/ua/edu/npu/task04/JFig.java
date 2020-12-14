package ua.edu.npu.task04;

import java.util.Random;

public class JFig implements TetrisFigure{
    public JFig() {}

    Random r = new Random();

    @Override
    public void create() {
        if (!isSuper(r.nextBoolean())) {
            System.out.println("Creating J-Figure");
        }
        else {
            System.out.println("Creating SUPER J-Figure");
        }
    }

    @Override
    public boolean isSuper(boolean active) {
        return active;
    }
}
