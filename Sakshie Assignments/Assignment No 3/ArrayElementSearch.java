import java.util.Scanner;

public class ArrayElementSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int elementToSearch = scanner.nextInt();
        boolean isFound = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == elementToSearch) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("The element " + elementToSearch + " is present in the array.");
        } else {
            System.out.println("The element " + elementToSearch + " is not present in the array.");
        }
    }
}