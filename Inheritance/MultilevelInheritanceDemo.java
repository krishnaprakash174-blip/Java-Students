class ElectronicDevice {
    void powerOn() {
        System.out.println("Device is powering on...");
    }
}


class MobilePhone extends ElectronicDevice {
    void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }
}


class SmartPhone extends MobilePhone {
    void browseInternet() {
        System.out.println("Browsing the internet via 5G...");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.powerOn();              
        phone.makeCall("9876543210"); 
        phone.browseInternet();       
    }
}