public class DiagonalSum {

    public static void main(String[] args) {
        // Define the matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calculate the sum of the left diagonal
        int leftDiagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            leftDiagonalSum += matrix[i][i];
        }

        // Calculate the sum of the right diagonal
        int rightDiagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            rightDiagonalSum += matrix[i][matrix.length - 1 - i];
        }

        // Print the results
        System.out.println("Sum of Left Diagonal: " + leftDiagonalSum);
        System.out.println("Sum of Right Diagonal: " + rightDiagonalSum);
    }
}
