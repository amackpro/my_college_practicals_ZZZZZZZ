import java.util.Scanner;

public class ArrayAnalysis {

    public static void main(String[] args) {
        // Create an array of size 15
        int[] numbers = new int[15];

        // Read 15 numbers from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 15 integer numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Initialize variables to track results
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sumEvenOddPositions = 0;
        int sumOddEvenPositions = 0;

        // Find largest and smallest elements
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }

        // Calculate sum of even numbers at odd positions and odd numbers at even
        // positions
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0 && numbers[i] % 2 == 0) { // Even position and even number
                sumEvenOddPositions += numbers[i];
            } else if (i % 2 == 1 && numbers[i] % 2 != 0) { // Odd position and odd number
                sumOddEvenPositions += numbers[i];
            }
        }

        // Display the results
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Sum of even numbers at odd positions: " + sumEvenOddPositions);
        System.out.println("Sum of odd numbers at even positions: " + sumOddEvenPositions);
    }
}
