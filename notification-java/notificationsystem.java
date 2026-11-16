class notification {
    public void send(String message) {
        System.out.println("Sending generic notification: " + message);
    }
}

class emailnotification extends notification {
    @Override 
    public void send(String message) {
        System.out.println("[EMAIL] Sent: " + message);
    }
}

class smsnotification extends notification {
    @Override 
    public void send(String message) {
        System.out.println("[SMS] Sent: " + message);
    }
}

class pushnotification extends notification {
    @Override 
    public void send(String message) {
        System.out.println("[PUSH] Sent: " + message);
    }
}

public class notificationsystem {
    public static void main(String[] args) {
        notification notify;
        notify = new emailnotification();
        notify.send("Your order has been shipped!");

        notify = new smsnotification();
        notify.send("Your OTP is 492011.");

        notify = new pushnotification();
        notify.send("Flash sale starts in 10 minuties!");
    }
}