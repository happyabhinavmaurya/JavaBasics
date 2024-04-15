package Oops.Concepts;

import Oops.Concepts.Inheritance.Inheritance;

public class MainClass {

    public static void main(String[] args) {

        // Creating object of Class
        Class Abhinav = new Class("Abhinav", 21);
        Abhinav.printDetails();

        // Creating object of Inheritance Class
        Inheritance Happy = new Inheritance("Abhinav Maurya", 21, "BCA");
        Happy.printDetails();
    }
}
