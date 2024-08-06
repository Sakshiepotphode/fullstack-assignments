import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int array[][] = new int[rows][cols];
        System.out.println("Enter the elements of the array: ");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                array[r][c] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                sum += array[r][c];
            }
        }
        
        System.out.println("Sum of the elements of the array is: " + sum);
    }
}