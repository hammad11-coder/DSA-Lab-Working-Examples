public class ReverseArray {
    public static void main(String[] args) {
        // Initialize the array with specified values
        int[] array = {55, 56, 57, 58};

        // Display the original array
        System.out.println("Original array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Reverse the array
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Swap elements
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        // Display the reversed array
        System.out.println("Reversed array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
