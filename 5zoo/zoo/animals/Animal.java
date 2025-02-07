package zoo.animals;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public void sleep() {
        System.out.println(name + " спит.");
    }
}
