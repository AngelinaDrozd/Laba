package ua.edu.npu.task06;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " recieved magazine");
    }
}
