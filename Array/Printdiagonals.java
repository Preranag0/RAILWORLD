package Array;

public class Printdiagonals {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Main Diagonal:");
        printMainDiagonal(matrix);

        System.out.println("\nSecondary Diagonal:");
        printSecondaryDiagonal(matrix);
    }

    // Function to print the main diagonal of the matrix
    public static void printMainDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
    }

    // Function to print the secondary diagonal of the matrix
    public static void printSecondaryDiagonal(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1 - i] + " ");
        }}
}
