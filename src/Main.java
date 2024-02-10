import oops.ClassesAndObjects;

public class Main {

    static void printf(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        ClassesAndObjects.Info abhinav = new ClassesAndObjects.Info("Abhinav", "Maurya", "Male");
        ClassesAndObjects.Info arpit = new ClassesAndObjects.Info("Arpit", "Maurya", "Male");

        // abhinav
        printf("FirstName : " + abhinav.getFirstName());
        printf("LastName: " + abhinav.getLastName());
        printf("Gender: " + abhinav.getGender());

        // arpit
        // set value
        arpit.setFirstName("Arpit");
        arpit.setLastName("Maurya");
        arpit.setGender("Male");

        printf("Firstname: " + arpit.getFirstName());
        printf("LastName: " + arpit.getLastName());
        printf("Gender: " + abhinav.getGender());


    }

}