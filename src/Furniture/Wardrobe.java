package Furniture;

public class Wardrobe implements Discountable, Customizable { // Теперь требует реализации только Discountable и Customizable
    private String brandName;
    private String description;
    private int price;
    private int width;
    private int height;

    public Wardrobe(String brandName, String description, int price, int width, int height) {
        this.brandName = brandName;
        this.description = description;
        this.price = price;
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "Шкаф [Бренд: " + brandName + ", Описание: " + description + "]";
    }

    @Override
    public String brandIdentifier(String brandName) {
        return "Бренд: " + brandName;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
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
    public void updateDescription(String newDescription) {
        this.description = newDescription;
        System.out.println("Описание обновлено на: " + this.description);
    }
}