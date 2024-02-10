package JavaVariables;

/*
Java Variables are containers for storing data values.

In Java, there are different types of variables, for example:

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false
 */
public class JavaVariables {
    public static void main(String[] args) {
        System.out.print("Declaring (Creating) Variable: ");
        System.out.println("type VariableName = Value; ");

        System.out.print("This is an Integer(int): ");

        int Date = 27;
        System.out.print("Declaration: int Date = 27; Output: ");
        System.out.println(Date);

        System.out.print("This is a Floating Point Number(float): ");

        float DateMonth = 27.04f;
        System.out.print("Declaration: float DateMonth = 27.04f; Output: ");
        System.out.println(DateMonth);

        System.out.print("This is a string(String): ");

        String MyName = "Abhinav Maurya";
        System.out.print("Declaration: String MyName = \"Abhinav Maurya\"; Output: ");
        System.out.println(MyName);

        System.out.print("This is a Character(char): ");

        char MyChar = 'A';
        System.out.print("Declaration: char MyChar = 'A'; Output: ");
        System.out.println(MyChar);

        System.out.print("This is a Boolean(boolean): ");

        boolean MyBool = true;
        System.out.print("Declaration: boolean MyBool = true; Output: ");
        System.out.println(MyBool);


    }
}
