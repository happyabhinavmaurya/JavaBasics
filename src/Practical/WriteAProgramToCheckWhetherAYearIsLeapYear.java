package Practical;

public class WriteAProgramToCheckWhetherAYearIsLeapYear {
    public static void main(String[] args) {
        int year = 2024; // Change this to the year you want to check

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4 but not by 100,
        // or if it is divisible by 400.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
