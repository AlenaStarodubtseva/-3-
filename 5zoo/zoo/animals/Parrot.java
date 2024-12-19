package zoo.animals;

import zoo.interfaces.Flyable;

public class Parrot extends Animal implements Flyable {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " ест фрукты.");
    }

    @Override
    public void fly() {
        System.out.println(name + " летает.");
    }
}
