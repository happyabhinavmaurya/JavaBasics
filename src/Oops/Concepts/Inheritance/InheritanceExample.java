package Oops.Concepts.Inheritance;

public class InheritanceExample {

    public static void main(String[] args) {

        MountainBike mb = new MountainBike();
        mb.input(200, "Black", 15, 2000000, 500, 6);
        mb.show();

        MountainBike mB = new MountainBike();
        mB.input(100, "Red", 18, 2500000, 700, 7);
        mB.show();
    }
}

class MountainBike extends Bike {

    int CC;
    int numGears;

    void input(int speed, String color, int tireSize, float cost, int CC, int numGears) {
        super.input(speed, color, tireSize, cost);
        this.CC = CC;
        this.numGears = numGears;
    }

    @Override
    void show() {
        super.show();
        System.out.println("CC: " + CC);
        System.out.println("Number of Gears: " + numGears);
    }
}

class Bike {
    int speed = 100;
    String color = "Black";
    int tireSize = 15;
    float cost = 2000000;

    void input(int speed, String color, int tireSize, float cost) {
        this.speed = speed;
        this.color = color;
        this.tireSize = tireSize;
        this.cost = cost;
    }

    void show() {
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Tire Size: " + tireSize);
        System.out.println("Cost: " + cost);
    }
}
