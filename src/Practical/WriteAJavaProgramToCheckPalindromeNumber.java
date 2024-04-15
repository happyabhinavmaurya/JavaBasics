package Practical;

public class WriteAJavaProgramToCheckPalindromeNumber {

    public static void main(String[] args) {
        int num = 1221;

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }

    public static boolean isPalindrome(int num) {
        int reversedNum = 0, remainder;
        int originalNum = num; // Keep a copy of the original number

        // Handle negative numbers (palindromes can't be negative)
        if (num < 0) {
            return false;
        }

        // Reverse the number
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // Check if reversed number is equal to original number
        return originalNum == reversedNum;
    }

}
