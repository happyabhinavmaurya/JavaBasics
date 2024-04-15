/*
Documentation:
    Abstraction:
        Abstraction is the process of hiding the implementation details and showing only the essential
        information to the user.
 */

package Oops.Concepts.Abstraction;

public class Abstraction {

    public static void main(String[] args) {

        B b = new B();
        b.input(10, 20);
        b.display();

        B b1 = new B();
        b1.input(30, 40);
        b1.display();
    }
}

abstract class Abstract {
    int x, y;

    abstract void input(int x, int y);

    abstract void display();
}

class B extends Abstract {
    void input(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println(x + " " + y);
    }
}
