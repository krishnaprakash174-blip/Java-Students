class Notification {
    public void send(String message) {
        System.out.println("Sending generic notification: " + message);
    }
}


class EmailNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}


class SMSNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

public class RuntimeDemo {
    public static void main(String[] args) {
        
        Notification notifier;

        notifier = new EmailNotification();
        notifier.send("Your order has shipped!"); 

        notifier = new SMSNotification();
        notifier.send("Your OTP is 482910.");     
    }
}