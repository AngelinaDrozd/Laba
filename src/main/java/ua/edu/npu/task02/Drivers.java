package ua.edu.npu.task02;

import java.util.concurrent.Semaphore;

public class Drivers extends Thread {
    Semaphore book;
    @Override
    public void run(){
        System.out.println(this.getName() + " Waiting a place");
        try {
            book.acquire();
            System.out.println(this.getName() + " Arriving ");
            System.out.println(this.getName() + " Packaging ");
            this.sleep(5000);
            System.out.println(this.getName() + " Going out");
            book.release();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
