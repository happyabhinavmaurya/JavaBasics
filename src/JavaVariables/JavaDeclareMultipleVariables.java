package JavaVariables;

public class JavaDeclareMultipleVariables {
    public static void main(String[] args) {

        // To declare more than one variable of the same type, We can use a comma-separated list:
        String FirstName = "Abhinav", LastName = "Maurya";

        System.out.println(FirstName + " " + LastName);

        // We can also assign the same value to multiple variables in one line:
        int num1, num2;
        num1 = num2 = 2;

        System.out.println("num1: " + num1 + "\nnum2: " + num2);
    }
}
