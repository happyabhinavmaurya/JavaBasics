package problems;

import java.util.Scanner;


public class Arrayexchange {
    static void printArray(int[] myArr) {
        for (int i = 0; i <= myArr.length - 1; i++) {
            System.out.print(myArr[i] + " ");
        }
    }

    static void getArray(int[] myArr) {
        Scanner keybord = new Scanner(System.in);
        for (int i = 0; i <= myArr.length - 1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            myArr[i] = keybord.nextInt();
        }
    }

    public static void main(String[] args) {

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        System.out.print("Current elements in arr1: ");
        printArray(arr1);

        System.out.print("\nCurrent elements in arr2: ");
        printArray(arr2);

        System.out.print("\nnEnter the arr1 elements: ");
        getArray(arr1);

        System.out.print("\nnEnter the arr2 elements: ");
        getArray(arr2);

        System.out.print("\nNow elements in arr1: ");
        printArray(arr1);

        System.out.print("\nNow elements in arr2: ");
        printArray(arr2);

        for (int i = 0; i <= arr1.length - 1; i++) {
            int copy = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = copy;
        }

        System.out.print("\nNow elements in arr1 after swap: ");
        printArray(arr1);

        System.out.print("\nNow elements in arr2 after swap: ");
        printArray(arr2);
    }
}
