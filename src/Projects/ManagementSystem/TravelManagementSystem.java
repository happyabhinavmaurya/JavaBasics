package Projects.ManagementSystem;

import java.util.Scanner;

public class TravelManagementSystem {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Motorcycle");
        System.out.println("2. Car");
        System.out.println("3. Bus");
        System.out.println("4. Truck");

        int choice = Keyboard.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1. Motorcycle");
                break;
            case 2:
                System.out.println("2. Car");
                break;
            case 3:
                System.out.println("3. Bus");
                break;
            case 4:
                System.out.println("4. Truck");
                break;
            default:
                System.out.println("Invalid option!");
        }

        Keyboard.close();


    }
}




/*
 */
