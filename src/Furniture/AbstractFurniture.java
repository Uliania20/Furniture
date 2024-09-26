package Furniture;

abstract class AbstractFurniture implements DimensionCalculator {
    // Абстрактный метод для расчета объема
    abstract int volumeCalculation(int length, int width, int height);


    @Override
    public int dimensionCalculator(int length, int width) {
        return length * width; // Метод для расчета площади
    }
}