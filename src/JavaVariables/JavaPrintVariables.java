package JavaVariables;

public class JavaPrintVariables {
    public static void main(String[] args) {

        String MyName = "Abhinav Maurya";

        // combine both text and a variable, use the + character:
        System.out.println("My Name is " + MyName + ".");

        String FirstName = "Abhinav";
        String LastName = "Maurya";

        // Use the + character to add a variable to another variable:
        System.out.println(FirstName + " " + LastName);

        // For numeric values, the + character works as a mathematical operator
        // (notice that we use int (integer) variables here):

        int num1 = 2;
        int num2 = 3;

        System.out.println(num1 + num2);

    }
}
