public class Pattern2 
{
    public static void main(String[] args) {
        int rows = 4; 
        int maxDigits = 7; 

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print(" ");
            }

            for (int j = 0; j < maxDigits - 2 * i; j++) 
            {
                if (j % 2 == 0) 
                {
                    System.out.print("1");
                } else 
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
