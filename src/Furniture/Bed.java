package Furniture;

public class Bed extends AbstractFurniture {
    private int width;
    private int length;
    private String brand;

    public Bed(int width, int length, String brand) {
        this.width = width;
        this.length = length;
        this.brand = brand;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }


    public String f(String brandName) {
        return "Бренд: " + brandName; // Возвращает информацию о бренде
    }

    public String toString() {
        return "Кровать [Ширина: " + width + ", Длина: " + length + ", " + f(brand) + "]";
    }

    @Override
    public int volumeCalculation(int length, int width, int height) {
        return length * width * height;
    }
}