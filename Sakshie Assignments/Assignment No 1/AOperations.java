import java.util.Scanner;
public class AOperations
{ int a;
  int b;
  public static int sum(int a,int b)
   { 
       return(a+b);
   }
  public static int sub(int a,int b)
  { 
      return(a-b);
  }
  public static int mul(int a,int b)
  { 
      return(a*b);
  }
  public static int div(int a,int b)
  {
      return(a/b);
  }
  public static int mod(int a,int b)
  {
      return(a%b);
  }
  public static void main(String[] args){
  AOperations obj= new AOperations();
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter first number: ");
  int num1=sc.nextInt();
  System.out.println("Enter second number: ");
  int num2=sc.nextInt();
  System.out.println("Addition: "+sum(num1,num2));
  System.out.println("Subtraction: "+sub(num1,num2));
System.out.println("Multiplication: "+mul(num1,num2));
System.out.println("Division: "+div(num1,num2));
System.out.println("Modulus: "+mod(num1,num2));

}
}