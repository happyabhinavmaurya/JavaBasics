package problems;

import java.util.Scanner;

public class ArrySum {

    static void printArray(int[] myArr, String name, String state) {
        int i;
        System.out.print(state + " elements in " + name + ": ");
        for (i = 0; i <= myArr.length - 1; i++) {
            System.out.print(myArr[i] + " ");
        }
        System.out.println(" ");
    }

    static void getArray(int[] myArr) {
        int i;
        Scanner keybord = new Scanner(System.in);
        for (i = 0; i <= myArr.length - 1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            myArr[i] = keybord.nextInt();
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arrSum = new int[5];

        printArray(arr1, "arr1", "Current");

        printArray(arr1, "arr2", "Current");

        System.out.println("nEnter the arr1 elements: ");
        getArray(arr1);

        System.out.println("nEnter the arr2 elements: ");
        getArray(arr2);

        printArray(arr1, "arr1", "New");

        printArray(arr2, "arr2", "New");

        for (int i = 0; i <= arr1.length - 1; i++) {
            arrSum[i] = arr1[i] + arr2[i];
        }

        printArray(arrSum, "arrSum", "After adding arr1 and arr2");
    }
}
