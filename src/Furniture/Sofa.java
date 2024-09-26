package Furniture;

public class Sofa extends AbstractFurniture {
    private int width;
    private int height;
    private String brand;
    private int length;

    public Sofa(int width, int height, String brand, int length) {
        this.width = width;
        this.height = height;
        this.brand = brand;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String getBrand(String brandName) {
        return "Бренд: " + brandName; // Возвращает информацию о бренде
    }

    public String toString() {
        return "Софа [Ширина: " + width + "Длина: " + length +", Высота: " + height + ", " + getBrand(brand) + "]";
    }

    @Override
    public int volumeCalculation(int length, int width, int height) {
        return width * height * length;
    }
}