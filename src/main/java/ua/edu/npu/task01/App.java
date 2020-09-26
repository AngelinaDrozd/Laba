package ua.edu.npu.task01;

import java.util.concurrent.Semaphore;

public class App {
    public static void main(String[] args) {
        Semaphore book = new Semaphore(3);

        Readers reader = new Readers();
        Readers reader1 = new Readers();
        Readers reader2 = new Readers();
        Readers reader3 = new Readers();
        Readers reader4 = new Readers();

        reader.book = book;
        reader1.book = book;
        reader2.book = book;
        reader3.book = book;
        reader4.book = book;

        reader.start();
        reader1.start();
        reader2.start();
        reader3.start();
        reader4.start();

    }
}
