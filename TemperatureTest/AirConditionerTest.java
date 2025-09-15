import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AirConditionerTest {
    @Test

    public void testTurnOn() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        assertTrue(ac.isOn());

    }


    @Test
    public void testTurnOff() {
        AirConditioner ac = new AirConditioner();
    ac.turnOff();
        assertFalse(ac.turnOff());



    }

}

