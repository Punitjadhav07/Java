import java.util.Scanner;

class Employee {
    String Name;
    int roll;

    Employee(String Name, int roll) {
        this.Name = Name;
        this.roll = roll;
    }

    void display() {
        System.out.println("name=" + Name);
        System.out.println("roll=" + roll);
    }
}

class Salary extends Employee {
    float ta, da, hra;

    Salary(String Name, int roll, float ta, float da, float hra) {
        super(Name, roll);
        this.ta = ta;
        this.da = da;
        this.hra = hra;
    }

    void disp() {
        float gross = ta + da + hra;
        System.out.println("name=" + Name);
        System.out.println("roll=" + roll);
        System.out.println("total salary=" + gross);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        Salary arr[] = new Salary[5];
        String b;
        int a;
        float c, d, e;
        for (int i = 0; i < 5; i++) {

            System.out.print("name= ");
            b = sc.nextLine();
            System.out.print("roll=");
            a = sc.nextInt();
            sc.nextLine();
            System.out.print("enter ta=");
            c = sc.nextFloat();
            System.out.print("enter da=");
            d = sc.nextFloat();
            System.out.print("enter hra=");
            e = sc.nextFloat();
            sc.nextLine();

            arr[i] = new Salary(b, a, c, d, e);
        }
        sc.close();
        for (int i = 0; i < 5; i++) {
            arr[i].disp();
            arr[i].display();
        }
    }
}
