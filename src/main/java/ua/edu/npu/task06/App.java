package ua.edu.npu.task06;

public class App {
    public static void main(String[] args) {
        PostOffice office = new PostOffice();

        Observer firstSubscriber = new Subscriber("Max");
        Observer secondSubscriber = new Subscriber("Tom");
        Observer thirdSubscriber = new Subscriber("Paul");

        office.register(firstSubscriber);
        office.register(secondSubscriber);

        office.recieveMagazines();
        System.out.println("\n");

        office.register(thirdSubscriber);

        office.recieveMagazines();
    }
}
