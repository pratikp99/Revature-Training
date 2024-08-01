import java.util.*;

public class ArmstrongNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       // int a=sc.nextInt();
        //int k=a;
        
        for(int i=100;i<=500;i++)
        {
            int sum=0;
            int k=i;
            while(k>0)
            {
                int digit=k%10;
                sum=sum+(digit*digit*digit);
                k=k/10;
            }
            if(sum==i)
            {
                System.out.println(i+" is a Armstrong Number");
            }
        }
        
    }
}
