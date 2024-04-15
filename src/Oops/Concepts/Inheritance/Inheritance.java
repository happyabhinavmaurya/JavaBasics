package Oops.Concepts.Inheritance;

import Oops.Concepts.Class;

// Inherited class from Class
public class Inheritance extends Class {
    String course;

    // Constructor
    public Inheritance(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    // override Method
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Course: " + course);
    }

}
