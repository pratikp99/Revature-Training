import java.util.*;
public class Attendance {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total number of days:");
        int a=sc.nextInt();
        System.out.println("Enter Total number of present days:");
        int b=sc.nextInt();

        int attended=(100*b)/a;
        if(attended>=75)
        {
            System.out.println("You are eligible to give the exam");
        }
        else{
            System.out.println("You are not eligible to give the exam");
        }
    }
}
