package JavaStrings;

public class JavaStrings {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting + ", Abhinav Maurya!");

        // String Length
        System.out.println("Length of 'greeting': " + greeting.length());

        String greet = greeting + ", Abhinav Maurya!";
        System.out.println(greet);

        // Convert string in Upper and Lower case
        System.out.println("Upper case 'greet': " + greet.toUpperCase() + "\nLower case 'greet': " + greet.toLowerCase());

        // Finding a character in a String
        System.out.println(greet.indexOf("o"));


    }
}
