import java.util.Scanner;

public class BubbleSortDescending {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        // Read 10 numbers from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = new Scanner(System.in).nextInt();
        }

        // Sort the numbers in descending order using bubble sort
        for (int i = 0; i < numbers.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // Optimization: early exit if no swaps occur in a pass
            }
        }

        // Print the sorted numbers in descending order
        System.out.println("Numbers sorted in descending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

