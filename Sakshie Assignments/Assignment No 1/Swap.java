import java.util.Scanner;
public class Swap
{
  public static int swapping(int a,int b)
  { 
      int temp=a;
      a=b;
      b=temp;
      System.out.println("Numbers after swapping: a = " + a + ", b= " + b);
      return(0);
  }
     
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter value of a");
      int val1=sc.nextInt();
      System.out.println("Enter value of b");
      int val2=sc.nextInt();
      swapping(val1,val2);
      
   }
 }