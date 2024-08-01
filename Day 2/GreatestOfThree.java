public class GreatestOfThree {

    public static int greatest(int a, int b, int c) {
        
        return (a >= b && a >= c) ? a : ((b >= c) ? b : c);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        int greatestNumber = greatest(num1, num2, num3);

        System.out.println("The greatest of the three numbers is: " + greatestNumber);
    }
}
