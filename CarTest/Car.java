public class Car {
    private final int fuelEfficiency; // km per liter
    private int fuelLevel;
    private boolean running;
    private final int maxCapacity = 50;

    public Car(int fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
        this.fuelLevel = 0;
        this.running = false;
    }

    public void start() {
        if (fuelLevel > 0) {
            running = true;
        }
    }

    public void stop() {
        running = false;
    }

    public void refuel(int liters) {
        fuelLevel = Math.min(fuelLevel + liters, maxCapacity);
    }

    public void drive(int distance) {
        if (!running) {
            throw new IllegalStateException("Car must be started before driving");
        }

        int fuelNeeded = distance / fuelEfficiency;
        if (fuelNeeded > fuelLevel) {
            throw new IllegalStateException("Not enough fuel to drive the distance");
        }

        fuelLevel -= fuelNeeded;
    }

    
    public int getFuelLevel() {
        return fuelLevel;
    }

    public boolean isRunning() {
        return running;
    }
}