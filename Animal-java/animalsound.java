class animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class dog extends animal {
    @Override 
    public void sound() {System.out.println("dog barks: Woof Woof!");}
}

class cat extends animal {
    @Override 
    public void sound() {System.out.println("cat meows: Meow!");}
}

class cow extends animal {
    @Override 
    public void sound() {System.out.println("cow moos: Moo!");}
}

public class animalsound {
    public static void main(String[] args) {
        animal a1 = new dog();
        animal a2 = new cat();
        animal a3 = new cow();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}