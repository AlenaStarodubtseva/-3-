import zoo.animals.*;
import zoo.interfaces.*;

public class ZooGame {
    public static void main(String[] args) {
        Animal lion = new Lion("Лев");
        Animal parrot = new Parrot("Попугай");
        Animal dolphin = new Dolphin("Дельфин");

        lion.eat();
        lion.sleep();

        parrot.eat();
        ((Flyable) parrot).fly(); // Вызов метода fly через интерфейс

        dolphin.eat();
        ((Swimmable) dolphin).swim(); // Вызов метода swim через интерфейс
    }
}
