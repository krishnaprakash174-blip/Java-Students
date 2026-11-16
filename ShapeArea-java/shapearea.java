class shape {
    public double calculateArea() {
        return 0.0;
    }
}

class circle extends shape {
    double radius;
    circle(double radius) {this.radius = radius;}
    @Override 
    public double calculateArea() { return Math.PI * radius * radius;}
}

class rectangle extends shape {
    double length, width;
    rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override 
    public double calculateArea() { return length * width; }
}

class triangle extends shape {
    double base, height;
    triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override 
    public double calculateArea() { return 0.5 * base * height; }
}

public class shapearea {
    public static void main(String[] args) {
        shape s1 = new circle(5);
        shape s2 = new rectangle(4, 6);
        shape s3 = new triangle(3, 8);

        System.out.printf("circle area: %.2f\n", s1.calculateArea());
        System.out.println("rectangle area: " + s2.calculateArea());
        System.out.println("triangle area: " + s3.calculateArea());
    }
}