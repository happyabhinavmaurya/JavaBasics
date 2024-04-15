package problems.swap;

import java.util.Scanner;

public class SwapingUsingThirdVariable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();

        System.out.println("Before swapping: x = " + x + ", y = " + y);

        // Swap using a temporary variable
        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping: x = " + x + ", y = " + y);

        scanner.close();
    }

}
