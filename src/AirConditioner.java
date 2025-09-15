public class AirConditioner {
    private boolean powerOn = false;

    public void turnOn() {
        powerOn = true;
    }

    public boolean turnOff() {
        powerOn = false;
        return false;
    }

    public boolean isOn() {
        return powerOn;
    }
}