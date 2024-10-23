import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define the size of the matrices
        int rows = 2;
        int columns = 2;
        
        // Initialize the matrices
        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];
        int[][] sumMatrix = new int[rows][columns];

        // Input for Matrix A
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Input for Matrix B
        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Adding the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Display the result
        System.out.println("Sum of Matrix A and Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
