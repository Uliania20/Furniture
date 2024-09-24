package Furniture;

interface Customizable extends DescriptionProvider, PriceCalculator {
    // Реализация метода для установки описания
    void setDescription(String description);
}
