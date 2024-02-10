package Output;

/*
* You can add as many println() methods as you want.
* Note that it will add a new line for each method.
* The Print() Method
  There is also a print() method, which is similar to println().

-- The only difference is that it does not insert a new line at the end of the output.
 */
public class PrintText {
    public static void main(String[] args) {
        System.out.println("First println() Method.");
        System.out.println("Second println() Method.");

        /*
        System.out.println(This will cause an error);
         */
        System.out.print("First print() Method. ");
        System.out.print("Second print() Method.");
    }
}
