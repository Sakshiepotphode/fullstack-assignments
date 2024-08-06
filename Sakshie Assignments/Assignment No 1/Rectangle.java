import java.util.Scanner;
public class Rectangle {
    int length;
    int breadth;
    public static int arearectangle(int length,int breadth)
    { 
        return(length*breadth);
    }
    public static int perimeter (int length,int breadth)
    { 
        return(2*length*breadth);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of a rectangle");
        int length=sc.nextInt();
        System.out.println("Enter breadth of a rectangle");
        int breadth=sc.nextInt();
        System.out.println("Area of a rectangle: " +arearectangle(length,breadth));
        System.out.println("Perimeter of a rectangle: "+perimeter (length,breadth));
    }
}