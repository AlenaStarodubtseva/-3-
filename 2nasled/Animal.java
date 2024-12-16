public class Animal {
    protected String name;

    // Конструктор для задания имени животного
    public Animal(String name) {
        this.name = name;
    }

    // Метод для вывода информации
    public void eat() {
        System.out.println(name + " ест.");
    }

    // Метод для общего звука
    public void makeSound() {
        System.out.println(name + " издает звук.");
    }
}
