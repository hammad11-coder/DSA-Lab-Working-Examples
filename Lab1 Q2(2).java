import java.util.Scanner;

public class DecimalComparison {

    // Method to check if two floating-point numbers are equal up to three decimal places
    public static boolean EqualUptoThreeDecimalPlaces(double num1, double num2) {
        return (int)(num1 * 1000) == (int)(num2 * 1000);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two floating-point numbers from the user
        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();

        // Compare up to three decimal places and display the result
        if (EqualUptoThreeDecimalPlaces(num1, num2)) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different up to three decimal places.");
        }

        scanner.close();
    }
}
