class store {
    private String name;
    private double price;
    private int quantity;

    public store(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {return name;}
    public double getPrice() {return price;}
    public int quantity() {return quantity;}

    public double calculateDiscountedTotal() {
        return price * quantity;
    }

    public void displayProductDetails() {
        System.out.println(name + " | Total: " + calculateDiscountedTotal());
    }
}

class electronics extends store {
    public electronics(String name, double price, int quantity) {super (name, price, quantity);}
    @Override 
    public double calculateDiscountedTotal() {return (getPrice() * getQuantity()) * 0.90;}
    @Override 
    public void displayProductDetails() {
        System.out.println("[electronics]" + getName() + " (10% off) -> Final Price: Rs. " + calculateDiscountedTotal());
    }
}

class clothing extends store {
    public clothing(String name, double price, int quantity) {super (name, price, quantity);}
    @Override 
    public double calculateDiscountedTotal() {return (getPrice() * getQuantity()) * 0.90;}
    @Override 
    public void displayProductDetails() {
        System.out.println("[clothing]" + getName() + " (10% off) -> Final Price: Rs. " + calculateDiscountedTotal());
    }
}

class foodproduct extends store {
    public foodproduct(String name, double price, int quantity) {super (name, price, quantity);}
    @Override 
    public double calculateDiscountedTotal() {return (getPrice() * getQuantity()) * 0.90;}
    @Override 
    public void displayProductDetails() {
        System.out.println("[food]" + getName() + " (10% off) -> Final Price: Rs. " + calculateDiscountedTotal());
    }
}

public class storeproduct {
    public static void main(String[] args) {
        store[] cart = {
            new electronics("Headphones", 2500, 2),
            new clothing("Jacket", 480, 3),
            new foodproduct("Organic Honey", 6000, 5)
        };
        for (store item : cart) {
            item.displayProductDetails();
        }
    }
}