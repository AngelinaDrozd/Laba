package ua.edu.npu.task07;

public class Main {
    public static void main(String[] args) {
        Activity act = new Creating();
        DEveloper dev1 = new DEveloper();


        dev1.setActivity(act);
        for(int i= 0; i<4; i++){
            dev1.doIt();
            dev1.changeActivity();
        }
    }
}
