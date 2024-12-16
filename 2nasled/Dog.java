public class Dog extends Animal {

    // Конструктор для Dog вызывает конструктор базового класса
    public Dog(String name) {
        super(name); // Вызов конструктора родительского класса
    }

    // Переопределение метода makeSound
    @Override
    public void makeSound() {
        System.out.println(name + " лает: Гав-гав!");
    }

    // Новый метод, специфичный для Dog
    public void fetch() {
        System.out.println(name + " приносит мячик.");
    }
}
