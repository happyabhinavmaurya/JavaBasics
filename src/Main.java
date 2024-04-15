import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str;
        char ch;
        double temp = 0.0;


        Scanner Keyboard = new Scanner(System.in);

        System.out.print("Enter your expression: ");
        str = Keyboard.nextLine();

        for (int i = 0; i < str.length(); i++) {
            ch = Keyboard.next().charAt(0);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                switch (ch) {
                    case '+':
                        temp += Keyboard.nextDouble();
                        break;
                    case '-':
                        temp -= Keyboard.nextDouble();
                        break;
                    case '*':
                        temp *= Keyboard.nextDouble();
                        break;
                    case '/':
                        temp /= Keyboard.nextDouble();
                        break;
                }
            } else if (ch == '=') {
                break;
            }


            temp += ch;
        }

        System.out.println("Result: " + temp);
    }

}