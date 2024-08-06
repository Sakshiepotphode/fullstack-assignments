import java.util.Scanner;

public class ArrayAverage {
    
    public static double calcAverage(double arr[]) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        double arr[] = new double[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        double average = calcAverage(arr);
        System.out.printf("The average of the array elements is: %.2f\n", average);
        scanner.close();
    }
}