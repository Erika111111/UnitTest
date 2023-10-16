package HW2;

// класс Car наследует класс транспортное средство
public class Car extends Vehicle {

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
    public Car(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        this.numWheels = 4;
        this.speed = 0;
    }
    public String getModel() {
        return model;
    }
    public int getYearRelease() {
        return yearRelease;
    }
    public int getNumWheels() {
        return numWheels;
    }
    public int getSpeed() {
        return speed;
    }
    @Override
    //переопределенный метод testDrive со скоростью 60
    public void testDrive() {
        this.speed = 60;
    }
    @Override
    // переопределенный метод park
    public void park() {
        this.speed = 0;
    }
    public String getCompany() {
        return company;
    }
    public String toString() { return "This car is a “ + year + “ “ + make + “ “ + model + ";}
}
