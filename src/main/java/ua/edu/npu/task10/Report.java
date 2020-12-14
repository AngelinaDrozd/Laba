package ua.edu.npu.task10;

import java.util.Timer;
import java.util.TimerTask;

public class Report {
    private String name;
    private String bacteryType;
    private int bacteryAmount;
    private boolean active;

    public Report(String name) {
        this.name = name;
    }

    public void setProperties(String bacteryType, int bacteryAmount) {
        this.bacteryType = bacteryType;
        this.bacteryAmount = bacteryAmount;
    }

    public boolean isActive() {
        return active;
    }

    public void add() {
        System.out.println("    " + name + "  " + bacteryType + "  " + bacteryAmount + " billion");

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                active = false;
                System.out.println(name + " deleted");
            }
        }, 1000);
        active = true;
    }
}
