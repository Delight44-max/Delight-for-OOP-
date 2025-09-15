import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BikeTest {
@Test
public void testBikeCanTurnOn() {
  Bike obj = new Bike();
  obj.turnOn();
assertTrue(obj.isOn());
}

public void testBikeCanTurnOff() {
    Bike obj = new Bike();
obj.turnOff();
assertFalse(obj.isOn());

}
public void testAcceleretOnGrearOne(){
Bike obj = new Bike();
obj.turnOn();
obj.accelerate();
assertEquals(1,obj.getSpeed());
}
public void testGearChangeFrom1To2(){
Bike obj = new Bike();
obj.turnOff();
for(int index=0;index<20;index++){
    obj.accelerate();
}

assertEquals(22,obj.getSpeed());
}

public void testDecelerateOnGrearTwo(){
Bike obj = new Bike();
obj.turnOn();
for(int index=0;index<20;index++){
    obj.decelerate();
    assertEquals(20,obj.getSpeed());
}

}

}
