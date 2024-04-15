package Oops.Exercises;

public class Person {
    String name;
    Integer age;

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("Abhinav", 21);

        person.printDetails();
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
