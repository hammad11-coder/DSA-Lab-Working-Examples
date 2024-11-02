
// new class
public class SwapExample {
    int a;
    int b;

// made constructor to initialize values
    public SwapExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

// creating a method to swap values 
    public void swap() {
        a = a + b; // Step 1: a now holds (a + b)
        b = a - b; // Step 2: b now holds (a + b) - b = original a
        a = a - b; // Step 3: a now holds (a + b) - a = original b
    }

//creating a method to output values
    public void printValues() {
        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        SwapExample obj = new SwapExample(1, 2);
        System.out.println("Before Swap:");
        obj.printValues();
        obj.swap();
        System.out.println("After Swap:");
        obj.printValues();
    }
}
