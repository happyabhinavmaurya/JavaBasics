package Practical;

public class WriteAProgramWithGivenInterfacesMotorbikeAndCycleThenImplementationInChildClassTwoWheelerAndDisplayDistanceAndSpeed {

    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler(50, 20.5);
        twoWheeler.displayDistance();
        twoWheeler.displaySpeed();
    }

    public interface Motorbike {
        // Declare a method to display the motorbike's speed
        void displaySpeed();
    }

    public interface Cycle {
        // Declare a method to display the cycle's distance
        void displayDistance();
    }

    public static class TwoWheeler implements Motorbike, Cycle {

        private final int speed;
        private final double distance;

        public TwoWheeler(int speed, double distance) {
            this.speed = speed;
            this.distance = distance;
        }

        @Override
        public void displaySpeed() {
            System.out.println("Two-wheeler speed: " + speed + " units/hour");
        }

        @Override
        public void displayDistance() {
            System.out.println("Two-wheeler distance: " + distance + " kilometers");
        }
    }

}
