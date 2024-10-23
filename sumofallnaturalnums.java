import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        // Using the formula
        int sum = n * (n + 1) / 2;
        
        System.out.println("The sum of natural numbers up to " + n + " is: " + sum);
    }
}