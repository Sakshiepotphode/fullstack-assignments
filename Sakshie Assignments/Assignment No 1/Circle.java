import java.util.Scanner;
import java.math.*;
public class Circle{
    float r;
    public static float areacircle(float r)
    { 
        return(3.14f*r*r);
    }
    public static float circum(float r)
    { 
        return(2*3.14f*r);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius of a circle");
        float radius=sc.nextFloat();
        System.out.println("Area of a circle: " +areacircle(radius));
        System.out.println("Circumference of a circle: "+circum(radius));
    }
}