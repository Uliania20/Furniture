package Furniture;

abstract class AbstractCustomizableFurniture implements Customizable {
    String description; // Хранение описания

    // Реализация метода для установки описания
    @Override
    public void setDescription(String description) {
        this.description = description; // Установка описания
    }

    @Override
    public void updateDescription(String newDescription) {
        this.description = newDescription;
        System.out.println("Описание обновлено на: " + this.description);
    }
}
