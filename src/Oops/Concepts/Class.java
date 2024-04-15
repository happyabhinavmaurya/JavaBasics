package Oops.Concepts;

public class Class {
    // Properties
    String name;
    int age;

    // Constructor
    protected Class(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Class method
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
