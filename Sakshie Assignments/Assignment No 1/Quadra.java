public class Quadra
{
    public static void main(String[] args)
    {
        int a=6,b=-18,c=-3;
        float d= 2*a;
        float q1=(float) (-b + Math.sqrt (b*b)-4*a*c);
        float q2=(float) (-b - Math.sqrt (b*b)-4*a*c);
        float f1=q1/d;
        float f2=q2/d;
        System.out.println("Factor 1 : "+f1);
        System.out.println("Factor 2 : "+f2);
    }
}