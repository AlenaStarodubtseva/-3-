public class Car {
    private Engine engine; // Композиция: машина обязательно имеет двигатель

    public Car(String engineType) {
        this.engine = new Engine(engineType); // Двигатель создается внутри машины
    }

    public void showDetails() {
        System.out.println("Машина с двигателем типа: " + engine.getType());
    }
}
