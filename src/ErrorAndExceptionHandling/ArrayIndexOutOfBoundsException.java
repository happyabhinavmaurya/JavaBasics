/*
Documentation for this code is here:
    Code for Exception Handling
    
 */
package ErrorAndExceptionHandling;

public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        int[] array = new int[5];

        //ArrayIndexOutOfBoundsException
        try {
            array[5] = 10;
            System.out.println(array[5]);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
    }
}
