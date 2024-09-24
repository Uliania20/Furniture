package Furniture;

public class Table implements DimensionCalculator {
    private int height;
    private int width;

    // Конструктор, принимающий высоту
    public Table(int height, int width) {
        this.height = height;
        this.width = width;
    }

    // Метод для расчета объема
    public int f(int length, int width) {
        return length * width * height; // Вычисляет объем
    }

    // Реализация метода интерфейса для расчета площади
    @Override
    public int dimensionCalculator(int width, int height) {
        return width * height; // Возвращает площадь
    }

    @Override
    public String toString() {
        return "Стол [Высота: " + height + ", Ширина: " + width + "]";
    }

    // Метод для возврата информации о бренде
    public String f(String brandName) {
        return "Бренд: " + brandName; // Возвращает информацию о бренде
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}