package ua.edu.npu.task06;

public interface Observable {
    void register(Observer obj);
    void notifyObservers();
}
