package Loops;

public class loops {

    public static void forEachOneLine(int[] singleDIntegerArray) {
        for (int arr : singleDIntegerArray) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }

    public static void forEachOneLine(String[] singleDIntegerArray) {
        for (String arr : singleDIntegerArray) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }

    public static void forEachOneLine(String[][] singleDIntegerArray) {
        int columns = singleDIntegerArray[0].length;
        for (String[] arr : singleDIntegerArray) {
            for (int i = 0; i < columns; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
