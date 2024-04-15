package ErrorAndExceptionHandling;

public class ArithmeticException {

    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            int z = x / y;
            System.out.println(z);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Exception: " + e);
        }
    }
}
