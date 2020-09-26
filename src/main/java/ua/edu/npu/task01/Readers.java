package ua.edu.npu.task01;

import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

public class Readers extends Thread {
    Semaphore book;
    @Override
    public void run(){
        System.out.println(this.getName() + " Waiting a book");
        try {
            book.acquire();
            System.out.println(this.getName() + " Reading the book");
            this.sleep(5000);
            System.out.println(this.getName() + " Realise book");
            book.release();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    }

