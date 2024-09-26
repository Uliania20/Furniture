package main;

import Furniture.*;

public class Main
{
    public static void main(String[] args){
        Bed bed = new Bed(200, 180, "IKEA");
        Sofa sofa = new Sofa(100, 90, "IKEA", 220);
        ChestOfDrawers chestOfDrawers = new ChestOfDrawers("Деревянный комод", 15000);
        Wardrobe wardrobe = new Wardrobe("IKEA", "Шкаф с зеркалом", 30000, 120, 200);

        // Вывод информации о мебели
        System.out.println("Информация о мебели:");
        System.out.println(bed);
        System.out.println(sofa);
        System.out.println(chestOfDrawers);
        System.out.println(wardrobe);


        chestOfDrawers.setDescription("Современный комод");
        wardrobe.setDescription("Шкаф с двумя дверями");

        // Вывод обновленных описаний
        System.out.println("\nОбновленные описания:");
        System.out.println(bed);
        System.out.println(sofa);
        System.out.println(chestOfDrawers);
        System.out.println(wardrobe);

        // Применение скидок к цене
        double discountPercentageForWardrobe = 10; // Скидка 10%
        double discountPercentageForChest = 15; // Скидка 15%

        double discountedPriceWardrobe = wardrobe.applyDiscount(discountPercentageForWardrobe);
        double discountedPriceChest = chestOfDrawers.applyDiscount(discountPercentageForChest);

        // Вывод информации о скидках
        System.out.println("\nЦена после применения скидки:");
        System.out.println("Шкаф: " + discountedPriceWardrobe);
        System.out.println("Комод: " + discountedPriceChest);

        // Рассчет площади и объема для кровати и софы
        int bedVolume = bed.volumeCalculation(bed.getLength(), bed.getWidth(), 50); // Используем произвольную высоту
        int sofaVolume = sofa.volumeCalculation(sofa.getLength(), sofa.getWidth(), sofa.getHeight()); // Используем высоту софы

        // Вывод объемов
        System.out.println("\nОбъемы:");
        System.out.println("Объем кровати: " + bedVolume + " куб. см");
        System.out.println("Объем софы: " + sofaVolume + " куб. см");
    }
}
