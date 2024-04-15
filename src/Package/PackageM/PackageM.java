package Package.PackageM;

import Package.PackageP.PackageP;

public class PackageM extends PackageP {

    public static void main(String[] args) {

        PackageM obj = new PackageM();
        obj.show();

    }

    @Override
    public void show() {
        System.out.println("PackageM");
    }
}
