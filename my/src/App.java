import java.util.Scanner;

class Volcir {
    int r;

    Volcir(int r) {
        this.r = r;
    }

    int calculateVolume() {
        return (int) ((4.0 / 3.0) * Math.PI * Math.pow(r, 3));
    }
}

class Volcub {
    int s;

    Volcub(int s) {
        this.s = s;
    }

    int calculateVolume() {
        return s * s * s;
    }
}

class Volcone {
    int rc, hc;

    Volcone(int rc, int hc) {
        this.rc = rc;
        this.hc = hc;
    }

    int calculateVolume() {
        return (int) ((1.0 / 3.0) * Math.PI * Math.pow(rc, 2) * hc);
    }
}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter 1 for volume of cube");
            System.out.println("Enter 2 for volume of Sphere");
            System.out.println("Enter 3 for volume of cone");
            System.out.println("Enter 0 to exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter side=");
                    int sid = sc.nextInt();
                    Volcub cube = new Volcub(sid);
                    System.out.println("Volume of Cube: " + cube.calculateVolume());
                    break;
                case 2:
                    System.out.print("Enter radius=");
                    int rad = sc.nextInt();
                    Volcir sphere = new Volcir(rad);
                    System.out.println("Volume of Sphere: " + sphere.calculateVolume());
                    break;
                case 3:
                    System.out.print("Enter radius=");
                    int radCone = sc.nextInt();
                    System.out.print("Enter height=");
                    int heiCone = sc.nextInt();
                    Volcone cone = new Volcone(radCone, heiCone);
                    System.out.println("Volume of Cone: " + cone.calculateVolume());
                    break;
                default:
                    break;
            }
        } while (choice != 0);

        
        sc.close();
    }
}
