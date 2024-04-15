package Practical;

public class WriteAProgramToDisplayTheWorkingOfFollowingMethodsOfStringToupperTolowerIndexofConcatSubstring {

    public static void main(String[] args) {
        String str = "This is a String Example";

        // toUpperCase() - convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Original String: " + str);
        System.out.println("String in Uppercase: " + upperStr);

        // toLowerCase() - convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("\nOriginal String: " + str);
        System.out.println("String in Lowercase: " + lowerStr);

        // indexOf() - find the index of a character/substring
        int index = str.indexOf("String"); // Case-sensitive
        System.out.println("\nOriginal String: " + str);
        System.out.println("Index of 'String': " + index);

        // indexOf() with starting index (optional)
        index = str.indexOf("is", 5); // Search from index 5
        System.out.println("Index of 'is' (starting from index 5): " + index);

        // concat() - concatenate strings
        String combinedStr = str.concat(" - Additional Text");
        System.out.println("\nOriginal String: " + str);
        System.out.println("Combined String: " + combinedStr);

        // substring() - extract a substring
        String subStr = str.substring(8, 14); // Extract characters from index 8 (inclusive) to 14 (exclusive)
        System.out.println("\nOriginal String: " + str);
        System.out.println("Substring: " + subStr);
    }


}
