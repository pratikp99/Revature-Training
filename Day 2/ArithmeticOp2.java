class ArithmeticOperations {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
             return a / b;
    }
}

public class ArithmeticOp2 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + ArithmeticOperations.add(num1, num2));
        System.out.println("Subtraction: " + ArithmeticOperations.subtract(num1, num2));
        System.out.println("Multiplication: " + ArithmeticOperations.multiply(num1, num2));
        System.out.println("Division: " + ArithmeticOperations.divide(num1, num2));
    }
}
