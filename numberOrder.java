import java.util.Scanner;

public class OrderChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Check the order and print the result
        checkOrder(num1, num2, num3);

        scanner.close();
    }

    // Method to check the order of three numbers and print the result
    public static void checkOrder(int num1, int num2, int num3) {
        if (num1 < num2 && num2 < num3) {
            System.out.println("increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
    }
}
