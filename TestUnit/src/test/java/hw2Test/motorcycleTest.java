package hw2Test;

import HW2.Motorcycle;
import HW2.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class motorcycleTest {
    private Motorcycle motorcycle;
    private Vehicle vehicle;

    @BeforeEach
    public void setUp(){
        motorcycle = new Motorcycle("Yamaha", "x5", 2020);
    }
    @Test
    @DisplayName("Motorcycle создается с 2-мя колесами")
    public void MotoNumWheels(){
        assertEquals(2, motorcycle.getNumWheels());
    }
    @Test
    @DisplayName("Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).")
    public void speedMoto(){
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }
    @Test
    @DisplayName("в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) " +
            "мотоцикл останавливается (speed = 0).")
    public void MotoParkSpeed(){
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }


}
