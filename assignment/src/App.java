import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of the cube: ");
        int sid = sc.nextInt();
        System.out.println("Volume of Cube: " + calculateVolume(sid));

        System.out.print("Enter radius of the sphere: ");
        int rad = sc.nextInt();
        System.out.println("Volume of Sphere: " + calculateVolume(rad));

        System.out.print("Enter radius of the cone: ");
        int radCone = sc.nextInt();
        System.out.print("Enter height of the cone: ");
        int heiCone = sc.nextInt();
        System.out.println("Volume of Cone: " + calculateVolume(radCone, heiCone));

        // Close the scanner
        sc.close();
    }

    public static int calculateVolume(int side) {
        return side * side * side;
    }

    public static double calculateVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double calculateVolume(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}
