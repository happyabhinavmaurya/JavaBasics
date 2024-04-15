package Practical;

import java.util.Scanner;

public class WriteAProgramToCheckIfAnInputCharacterIsVowelOrConstantIfItIsNoneDisplayError {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); // Get the first character of the input

        scanner.close();

        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel");
        } else if (Character.isLetter(ch)) { // Check for letters (consonants)
            System.out.println(ch + " is a consonant");
        } else {
            System.out.println(ch + " is not an alphabet");
        }
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase for case-insensitive check
        return "aeiou".indexOf(ch) != -1; // Check if ch is in the vowels string
    }
}