package Output;

/*
 * Print Numbers
 * We can also use the println() method to print numbers.

 * However, unlike text, we don't put numbers inside double quotes:
 */
public class JavaOutputNumbers {
    public static void main(String[] args) {
        System.out.println(27);
        System.out.print(2002);

        // We can also perform mathematical calculations inside the println() method:

        System.out.println("\nWe can also perform mathematical calculations inside the println() method:");

        System.out.println(2 + 3);
        System.out.print(2 * 3);
    }
}
