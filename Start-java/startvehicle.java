class start {
    public void start() {System.out.println("Vehicle is starting...");}
}

class car extends start {
    @Override 
    public void start() {System.out.println("Car starts with a push-button ignition.");}
}

class bike extends start {
    @Override 
    public void start() {System.out.println("Bike starts with a kick or self-start.");}
}

class bus extends start {
    @Override 
    public void start() {System.out.println("Bus starts with a heavy-duty key ignition.");}
}

public class startvehicle {
    public static void main(String[] args) {
        start[] start = {new car(), new bike(), new bus()};
        for (start s : start) {
            s.start();
        }
    }
}