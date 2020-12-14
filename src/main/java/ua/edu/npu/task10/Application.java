package ua.edu.npu.task10;

import java.util.Random;

public class Application {
    static Random r = new Random();

    private static String[] bacteryTypes = {"Clamydiae", "Wolbachia", "Salmonella"};
    private static int[] bacteryAmmounts = {1, 3, 5, 10, 15, 20};

    public static String getRandBacteryType() {
        return bacteryTypes[r.nextInt(bacteryTypes.length)];
    }

    public static int getRandBacteryAmmount() {
        return bacteryAmmounts[r.nextInt(bacteryAmmounts.length)];
    }

    public static void main(String[] args) throws InterruptedException {
        ReportFactory factory = new ReportFactory();
        for (int i=0; i<15; i++) {
            Report rep = factory.getReport(getRandBacteryType(), getRandBacteryAmmount());
            if (rep != null) {
                System.out.println("report" + (i+1));
                rep.add();
            }
            else {
                i--;
                Thread.sleep(800);
            }
        }
    }
}
