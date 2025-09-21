import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void testCarStartStop() {
        Car car = new Car(10);
        assertFalse(car.isRunning());
        car.start();
        assertTrue(car.isRunning());
        car.stop();
        assertFalse(car.isRunning());
    }

    @Test
    void testRefuel() {
        Car car = new Car(10);
        car.refuel(30);
        assertEquals(30, car.getFuelLevel());
        car.refuel(25);
        assertEquals(50, car.getFuelLevel()); 
    }

    @Test
    void testDriveConsumesFuel() {
        Car car = new Car(10);
        car.refuel(10);
        car.start();
        car.drive(50); 
        assertEquals(5, car.getFuelLevel());
    }
}