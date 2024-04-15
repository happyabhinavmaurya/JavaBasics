package Oops.Concepts.Interface;

public interface Interface {

    void display();

    void Animal();
}

class A implements Interface {

    @Override
    public void display() {
        System.out.println("Hello");
    }

    @Override
    public void Animal() {
        System.out.println("Dog");
    }
}
