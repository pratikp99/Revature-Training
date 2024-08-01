import java.util.*;

public class Pattern1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,j;
        while(i<n)
        {
            j=0;
            while(j<n)
            {
                if(i>=j)
                {
                    System.out.print("*");
                }
                j++;
            }
            i++;
            System.out.println("");
        }
    }
}
