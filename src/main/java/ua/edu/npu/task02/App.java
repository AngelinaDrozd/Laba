package ua.edu.npu.task02;

import java.util.concurrent.Semaphore;

public class App {
    public static void main(String[] args) {
        Semaphore place = new Semaphore(3);

        Drivers reader = new Drivers();
        Drivers reader1 = new Drivers();
        Drivers reader2 = new Drivers();
        Drivers reader3 = new Drivers();
        Drivers reader4 = new Drivers();

        reader.book = place;
        reader1.book = place;
        reader2.book = place;
        reader3.book = place;
        reader4.book = place;

        reader.start();
        reader1.start();
        reader2.start();
        reader3.start();
        reader4.start();

    }
}
