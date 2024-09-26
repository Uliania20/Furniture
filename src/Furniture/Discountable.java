package Furniture;

interface Discountable extends BrandIdentifier, PriceCalculator, DescriptionProvider {
    double applyDiscount(double discountPercentage);
}