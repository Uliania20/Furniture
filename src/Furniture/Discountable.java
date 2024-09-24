package Furniture;

interface Discountable extends BrandIdentifier, PriceCalculator, DescriptionProvider {
    public double applyDiscount(double discountPercentage);
}