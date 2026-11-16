class calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}

class calculatorDemo {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println("---Addition---");
        System.out.println("Add 2 ints (10+20): " + calc.add(10, 20));
        System.out.println("Add 3 ints (10+20+30): " + calc.add(10, 20, 30));
        System.out.println("Add 2 doubles (12.5+7.5): " + calc.add(12.5, 7.5));

        System.out.println("\n ---Subtraction---");
        System.out.println("Subtract 2 ints (50-15): " + calc.subtract(50, 15));
        System.out.println("Subtract 2 doubles (25.5-10.2): " + calc.subtract(25.5,10.2));

        System.out.println("\n ---Multiplication---");
        System.out.println("Multiply 2 ints (5 * 6): " + calc.multiply(5, 6));
        System.out.println("Multiply 3 ints (2 * 3 * 4): " + calc.multiply(2, 3, 4));
        System.out.println("Multiply 2 doubles (2.5 * 4.0): " + calc.multiply(2.5, 4.0));
    }
}