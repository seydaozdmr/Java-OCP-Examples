package javaocp.Siniflar.AbstractAnimals;

import java.time.LocalTime;

public class Horses extends Animal{

    public Horses(String name, double weight, int age) {
        super(name, weight, age);
    }

    public Horses() {
        super();
    }

    @Override
    public void getDosage() {
        System.out.println("horses dosage.");
    }

    @Override
    public long getFeedSchedule() {
        return LocalTime.of(2,0).getMinute();
    }
}
