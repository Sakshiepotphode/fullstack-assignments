import java.util.Scanner;

public class Power
{
    public static int power(int base,int exponent)
    {
        int i;
        int result=1;
        for(i=0;i<exponent;i++)
        {
           result*= base; 
        }
        return result;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the exponent (b): ");
        int b = sc.nextInt();
        System.out.println(a + " raised to the power of " + b + " is: " +power(a,b));
    }
}