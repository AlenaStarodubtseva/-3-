import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список фигур
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());    // Добавляем круг
        shapes.add(new Rectangle()); // Добавляем прямоугольник
        shapes.add(new Shape());     // Базовая фигура

        // Используем полиморфизм: вызываем метод draw()
        for (Shape shape : shapes) {
            shape.draw(); // Каждый объект вызывает свою реализацию метода
        }
    }
}
