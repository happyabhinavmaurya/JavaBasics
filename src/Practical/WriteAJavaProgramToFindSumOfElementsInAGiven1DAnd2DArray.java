package Practical;

public class WriteAJavaProgramToFindSumOfElementsInAGiven1DAnd2DArray {

    public static int sumOf1DArray(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    public static int sumOf2DArray(int[][] arr) {
        int sum = 0;
        for (int[] row : arr) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] oneDArray = {1, 2, 3, 4, 5};
        int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int oneDSum = sumOf1DArray(oneDArray);
        int twoDSum = sumOf2DArray(twoDArray);

        System.out.println("Sum of 1D array: " + oneDSum);
        System.out.println("Sum of 2D array: " + twoDSum);
    }
}
