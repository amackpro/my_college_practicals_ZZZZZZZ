import java.util.Scanner;

public class BinarySearch {

    public static boolean binarySearch(int[] list, int target) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2; // Find the middle index

            if (list[mid] == target) {
                return true; // Found the target
            } else if (list[mid] < target) {
                low = mid + 1; // Move to the right half
            } else {
                high = mid - 1; // Move to the left half
            }
        }

        return false; // Target not found
    }

    public static void main(String[] args) {
        // Sample sorted list
        int[] list = { 2, 5, 7, 9, 12, 14 };

        // User input for the number to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        // Perform and display the result
        boolean found = binarySearch(list, target);
        if (found) {
            System.out.println("The number " + target + " is present in the list.");
        } else {
            System.out.println("The number " + target + " is not present in the list.");
        }
    }
}
