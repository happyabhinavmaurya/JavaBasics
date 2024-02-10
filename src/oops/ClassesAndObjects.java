package oops;

public class ClassesAndObjects {
    public static class Info {
        private String FirstName;
        private String LastName;
        private String Gender;

        // the constructor name must match the class name, and it cannot have a return type (like void).
        public Info(String FirstName, String LastName, String gender) {
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.Gender = gender;
        }

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            this.FirstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            this.LastName = lastName;
        }

        public String getGender() {
            return Gender;
        }

        public void setGender(String gender) {
            this.Gender = gender;
        }

    }

    public static class Sum {
        int x;
        int y;
    }
}
