public class AirconditionerMain {
public static void main(String[] args) {

   AirConditioner ac = new AirConditioner();
   ac.turnOn();
   System.out.println("AC is On? " + ac.isOn());

    ac.turnOff();
    System.out.println("AC is Off? " + ac.isOn());

}


}

