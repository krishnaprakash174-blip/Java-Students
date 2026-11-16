class Product {
    String name;
    double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public void displayBasicInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Base Price: $" + String.format("%.2f", basePrice));
    }
}

class ElectronicProduct extends Product {
    double discountRate;
    double taxRate;

    public ElectronicProduct(String name, double basePrice, double discountRate, double taxRate) {
        super(name, basePrice);
        this.discountRate = discountRate;
        this.taxRate = taxRate;
    }

    public double calculateFinalPrice() {
        double discountAmount = basePrice * (discountRate / 100);
        double discountedPrice = basePrice - discountAmount;
        double taxAmount = discountedPrice * (taxRate / 100);

        return discountedPrice + taxAmount;
    }

    public void displayBill() {
        displayBasicInfo();
        double discountAmount = basePrice * (discountRate / 100);
        double discountedPrice = basePrice - discountAmount;
        double taxAmount = discountedPrice * (taxRate / 100);
        double finalPrice = calculateFinalPrice();

        System.out.println("Discount (" + discountRate +"%): -$" + String.format("%.2f", discountAmount));
        System.out.println("Price After Discount: -$" + String.format("%.2f", discountedPrice));
        System.out.println("Tax (" + taxRate + "%): +$" + String.format("%.2f", taxAmount));
        System.out.println("Final Payable Price: $" + String.format("%.2f", finalPrice));
    }
}

public class inheritance {
    public static void main(String[] args) {
        ElectronicProduct laptop = new ElectronicProduct("Gaming Laptop", 80000.00, 10.0, 18.0);
        laptop.displayBill();
    }
}