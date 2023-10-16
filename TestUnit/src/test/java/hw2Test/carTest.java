package hw2Test;

import HW2.Car;
import HW2.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

// Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
 // (используя оператор instanceof).
public class carTest {
 private Car car;
 private Vehicle vehicle;

 @BeforeEach
 public void setUp() {
  car = new Car("Mercedes", "Benz", 2022);

 }
 @Test
 @DisplayName("Car является наследником класса Vehicle?")
 public void CarInstanceOfVehicle(){
  assertTrue(car instanceof Vehicle);
  }

  @Test
 @DisplayName("Car создается с 4 колесами?")
 public void CarNumWheels(){

   assertEquals(4, car.getNumWheels());
  }

 @Test
 @DisplayName("Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).")
 public void speedCar(){
  car.testDrive();
  assertEquals(60, car.getSpeed());
 }
 @Test
 @DisplayName("в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) " +
         "машина останавливается (speed = 0).")
 public void carParkingSpeed(){
  car.testDrive();
  car.park();
  assertEquals(0, car.getSpeed());
 }


}

