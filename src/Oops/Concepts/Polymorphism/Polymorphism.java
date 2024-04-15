package Oops.Concepts.Polymorphism;

public class Polymorphism {

    public static void main(String[] args) {

        LightBulb lightBulb = new LightBulb("Lamp", "Philips", "LX-123", "237.84.2.178", true, 10.0f, "Red");
        lightBulb.printDetails();
        lightBulb.increaseBrightness();
        lightBulb.decreaseBrightness();
        lightBulb.changeColor("Blue");
        lightBulb.changeColor("Green");

    }
}

class Tv extends SmartDevice {
    int channel;

    Tv(String name, String brand, String model, String ipAddress, boolean isConnected, int channel) {
        super(name, brand, model, ipAddress, isConnected);
        this.channel = channel;
    }

    void changeChannel(int newChannel) {
        channel = newChannel;
        System.out.println("Channel changed to " + channel);
    }

    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Channel: " + channel);
    }
}

class LightBulb extends SmartDevice {
    private float Brightness;
    private String Color;

    LightBulb(String name, String brand, String model, String ipAddress, boolean isConnected, float Brightness, String Color) {
        super(name, brand, model, ipAddress, isConnected);
        this.Brightness = Brightness;
        this.Color = Color;
    }

    void increaseBrightness() {
        if (Brightness == 100) {
            System.out.println("Brightness is already at maximum");
        } else {
            Brightness += 10;
            System.out.println("Brightness increased to " + Brightness);
        }
    }

    void decreaseBrightness() {
        if (Brightness == 10) {
            System.out.println("Brightness is already at minimum");
        } else {
            Brightness -= 10;
            System.out.println("Brightness decreased to " + Brightness);
        }
    }

    void changeColor(String newColor) {
        Color = newColor;
        System.out.println("Color changed to " + Color);
    }

    @Override
    void printDetails() {
        super.printDetails();
    }
}

class SmartDevice {
    private final String name;
    private final String brand;
    private final String model;
    private final String ipAddress;
    private final boolean isConnected;

    SmartDevice(String name, String brand, String model, String ipAddress, boolean isConnected) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.ipAddress = ipAddress;
        this.isConnected = isConnected;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("IP Address: " + ipAddress);
        System.out.println("Is Connected: " + isConnected);
    }
}
