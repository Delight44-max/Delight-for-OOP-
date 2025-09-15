public class BikeMain {
    public static void main(String[] args){
            Bike obj = new Bike();
            obj.turnOn();
            System.out.println("Bike is On? " + obj.isOn());

    obj.turnOff();
    System.out.println("Bike is Off? " + obj.isOn());
    }


}

