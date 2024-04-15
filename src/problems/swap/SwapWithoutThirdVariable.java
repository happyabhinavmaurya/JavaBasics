package problems.swap;

import java.util.Scanner;

public class SwapWithoutThirdVariable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();

        System.out.println("Before swapping: x = " + x + ", y = " + y);

        // Swap using arithmetic operations
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping: x = " + x + ", y = " + y);
    }

}
