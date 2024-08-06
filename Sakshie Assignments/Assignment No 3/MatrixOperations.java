import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns of the matrices: ");
        int cols = scanner.nextInt();
        double[][] matrix1 = new double[rows][cols];
        double[][] matrix2 = new double[rows][cols];

        System.out.println("Enter elements for the first matrix:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix1[r][c] = scanner.nextDouble();
            }
        }
        System.out.println("Enter elements for the second matrix:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix2[r][c] = scanner.nextDouble();
            }
        }
        double[][] sumMatrix = addMat(matrix1, matrix2);
        double[][] subtractMatrix = subMat(matrix1, matrix2);
        double[][] divideMatrix = divMat(matrix1, matrix2);
        System.out.println("Sum of the matrices:");
        printMat(sumMatrix);

        System.out.println("Subtraction of the matrices:");
        printMat(subtractMatrix);

        System.out.println("Division of the matrices:");
        printMat(divideMatrix);
    }

    public static double[][] addMat (double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                result[r][c] = matrix1[r][c] + matrix2[r][c];
            }
        }
        return result;
    }

    public static double[][] subMat (double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                result[r][c] = matrix1[r][c] - matrix2[r][c];
            }
        }
        return result;
    }

    public static double[][] divMat (double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix2[r][c] != 0) {
                    result[r][c] = matrix1[r][c] / matrix2[r][c];
                } else {
                    System.out.println("Error: Division by zero at position (" + r + "," + c + ")");
                    result[r][c] = Double.NaN;  
                }
            }
        }
        return result;
    }

    public static void printMat(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
    }
}