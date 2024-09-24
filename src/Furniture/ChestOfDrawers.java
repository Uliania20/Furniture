package Furniture;

public class ChestOfDrawers extends AbstractCustomizableFurniture implements FurnitureInfo, Discountable {
    private String description;
    private int price;

    public ChestOfDrawers(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public String toString() {
        return "Комод [Описание: " + description + ", Цена: " + price + "]";
    }

    @Override
    public String brandIdentifier(String brandName) {
        return "Бренд: " + brandName;
    }

    @Override
    public int dimensionCalculator(int width, int height) {
        return width * height;
    }

    @Override
    public int discountedPrice(int price, int discount) {
        return price - discount;
    }

    @Override
    public double applyDiscount(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }

    @Override
    public double getPrice() {
        return price;
    }
}