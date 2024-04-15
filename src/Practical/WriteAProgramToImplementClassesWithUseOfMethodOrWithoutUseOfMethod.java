package Practical;

public class WriteAProgramToImplementClassesWithUseOfMethodOrWithoutUseOfMethod {

    public static void main(String[] args) {
        // Create a Point object (without methods)
        Point point1 = new Point();
        point1.x = 5;
        point1.y = 10;

        System.out.println("Point coordinates: (" + point1.x + ", " + point1.y + ")");

        // Create a Rectangle object (with methods)
        Rectangle rect1 = new Rectangle();
        rect1.width = 10;
        rect1.height = 5;

        rect1.displayInfo(); // Call the method to display info
    }

    public static class Point {
        // Define attributes to represent a point
        public int x;
        public int y;
    }

    public static class Rectangle {
        // Define attributes for rectangle dimensions
        public int width;
        public int height;

        // Method to calculate the rectangle's area
        public int calculateArea() {
            return width * height;
        }

        // Method to display the rectangle's information
        public void displayInfo() {
            System.out.println("Width: " + width + ", Height: " + height + ", Area: " + calculateArea());
        }
    }
}
