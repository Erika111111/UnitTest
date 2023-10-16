package HW2;

// абстрактный класс транспортное средство
public abstract class Vehicle {
    // приватное поле компания
    private String company;
    // приватное поле модель
    private String model;
    // приватное поле год выпуска
    private int yearRelease;
    // приватное поле количество колес
    private int numWheels;
    // приватное поле скорость
    private int speed;

    // абстрактный метод testDrive
    public abstract void testDrive();

    // абстрактный метод park
    public abstract void park();
}

