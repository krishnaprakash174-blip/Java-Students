class pro {
    private String name;
    private double price;
    private int quantity;

    public pro(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;   
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public static void main(String[] args) {
        pro p = new pro("Wireless Mouse", 750.0, 5);
        System.out.println("Total Inventory Value: Rs. " + p.getTotalValue());
    }
}