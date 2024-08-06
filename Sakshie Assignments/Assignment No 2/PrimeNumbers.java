import java.util.Scanner;

public class PrimeNumbers
 {
       public static boolean isPrime(int n)
     {
        for (int i = 2; i <= Math.sqrt(n); i++)
         {
            if (n % i == 0) {
                return false;
          }
      }
        return true;
     }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number limit: ");
        int n = scanner.nextInt();

   
        System.out.println("Prime numbers between 1 and " + n + ":");
        for (int i = 2; i <= n; i++) 
        {
            if (isPrime(i)) {
                System.out.println(i);
         }
    }
      
}
}
    