package zoo.animals;

import zoo.interfaces.Swimmable;

public class Dolphin extends Animal implements Swimmable {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " ест рыбу.");
    }

    @Override
    public void swim() {
        System.out.println(name + " плавает.");
    }
}
