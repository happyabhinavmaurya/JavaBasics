package Oops.Exercises;

public class Calculator {
    static Integer result;

    static void add(Integer a, Integer b) {
        result = a + b;
    }

    static void subtract(int a, int b) {
        result = a - b;
    }

    static int getResult() {
        return result;
    }

    public static void main(String[] args) {

        add(2, 4);
        int result = getResult();
        System.out.println("Addition of 2 and 4: " + result);

        subtract(2, 4);
        result = getResult();
        System.out.println("Subtraction of 2 and 4: " + result);

    }
}
