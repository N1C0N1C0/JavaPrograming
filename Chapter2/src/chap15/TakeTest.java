package chap15;

public class TakeTest {
    public static void main(String[] args) {
        Person person = new Person("Edward", 20000);


        Taxi taxi = new Taxi("잘 간다 운수택시");

        person.take(taxi);
        person.showInfo();

        taxi.showTaxiInfo();
    }
}
