package main;

import Furniture.*;

public class Main
{
    public static void main(String[] args){
// Создаем экземпляры мебели
        Wardrobe wardrobe = new Wardrobe("IKEA", "Современный шкаф", 15000, 100, 200);
        Table table = new Table(75, 120); // Высота 75 см, ширина 120 см
        Sofa sofa = new Sofa(80, 90, "Ashley", 200); // Ширина 80 см, высота 90 см, длина 200 см
        ChestOfDrawers chestOfDrawers = new ChestOfDrawers("Деревянный комод", 12000);
        Bed bed = new Bed(160, 200, "Sleepwell"); // Ширина 160 см, длина 200 см

        // Отображаем информацию о каждом предмете мебели
        System.out.println(wardrobe);
        System.out.println("Цена со скидкой (10%): " + wardrobe.applyDiscount(10));

        System.out.println(table);
        System.out.println("Площадь стола: " + table.dimensionCalculator(table.getWidth(), table.getHeight()));

        System.out.println(sofa);
        System.out.println("Объем софы: " + sofa.volumeCalculation(sofa.length, sofa.width, sofa.height));

        System.out.println(chestOfDrawers);
        System.out.println("Цена со скидкой (15%): " + chestOfDrawers.applyDiscount(15));

        System.out.println(bed);
        System.out.println("Объем кровати: " + bed.volumeCalculation(bed.length, bed.width, 30)); // Высота кровати условно 30 см
    }
}
