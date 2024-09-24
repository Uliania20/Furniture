package Furniture;

abstract class AbstractCustomizableFurniture implements Customizable {
    String description; // Хранение описания

    // Реализация метода для установки описания
    @Override
    public void setDescription(String description) {
        this.description = description; // Установка описания
    }

    // Метод для получения описания
    public String getDescription() {
        return description; // Возвращает описание
    } // Устанавливает описание
}
