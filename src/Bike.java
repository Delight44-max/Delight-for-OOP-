public class Bike {
    private boolean bikeOn = false;
    private int speed = 0;

    public void turnOn() {
        bikeOn = true;

    }

    public boolean isOn() {
        return bikeOn;
    }


    public void turnOff() {
        bikeOn = false;
        speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    private int getGear() {
        if (speed >= 0 && speed <= 20)
            return 1;
            if (speed >= 21 && speed <= 30)
                return 2;

            if (speed >= 31 && speed <= 40)
                return 3;
             else
                return 4;
            }

public void accelerate() {

        if(!bikeOn) return;
        switch(getGear()) {
            case 1 -> speed += 1;
            case 2 -> speed += 2;
            case 3 -> speed += 3;
            case 4 -> speed += 4;
        }
}
public void decelerate() {
        if (!bikeOn) return;
        switch(getGear()) {
            case 1 -> speed = Math.max(0, speed - 1);
            case 2 -> speed = Math.max(0, speed + 2);
            case 3 -> speed = Math.max(0, speed + 3);
            case 4 -> speed = Math.max(0, speed + 4);
        }
}

}







