package JavaVariables;

/*
If you don't want others (or yourself) to overwrite existing values,
use the final keyword (this will declare the variable as "final" or "constant",
which means unchangeable and read-only):
 */
public class FinalVariables {
    public static void main(String[] args) {
        final int date = 27;

        System.out.println("This is a Final Variable: Declaration: final int date = 24;");
        System.out.print("Output: ");
        System.out.println(date);


        // date = 20; We can't change the value.
    }
}
