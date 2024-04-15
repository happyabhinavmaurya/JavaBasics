package Practical;

import java.util.Scanner;

public class WriteAProgramToAcceptAStringIntegerFloatDoubleValueFromTheKeyboard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of value (string, int, float, double): ");
        String type = scanner.nextLine();

        switch (type.toLowerCase()) {
            case "string":
                System.out.println("Enter a string: ");
                String str = scanner.nextLine();
                System.out.println("You entered: " + str);
                break;
            case "int":
                System.out.println("Enter an integer: ");
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
                break;
            case "float":
                System.out.println("Enter a float: ");
                float f = scanner.nextFloat();
                System.out.println("You entered: " + f);
                break;
            case "double":
                System.out.println("Enter a double: ");
                double d = scanner.nextDouble();
                System.out.println("You entered: " + d);
                break;
            default:
                System.out.println("Invalid type entered.");
        }
        scanner.close();
    }
}
