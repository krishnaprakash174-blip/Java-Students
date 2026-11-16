class Shape {
    public double calculateArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override 
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override 
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class inheritance {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 4.0);
        Circle circle = new Circle(3.0);

        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.printf("Area of Circle: %.2f\n", circle.calculateArea());
    }
}