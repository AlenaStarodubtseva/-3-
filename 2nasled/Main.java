public class Main {
    public static void main(String[] args) {
        // Создание объекта класса Animal
        Animal animal = new Animal("Животное");
        animal.eat();
        animal.makeSound();

        // Создание объекта класса Dog (наследник)
        Dog dog = new Dog("Барсик");
        dog.eat();          // Наследуется из Animal
        dog.makeSound();    // Переопределенный метод
        dog.fetch();        // Собственный метод Dog
    }
}
