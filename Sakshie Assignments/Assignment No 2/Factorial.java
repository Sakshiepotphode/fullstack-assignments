import java.util.Scanner;
public class Factorial 
{
    public static int fac(int num)
    {
        int factorial= 1;
        int i;
        for(i=1;i<=num;i++)
        {
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        int factorial= fac(number);
        System.out.println("The factorial of " +number + " is:" +factorial);
    }
}