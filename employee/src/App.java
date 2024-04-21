import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Emp emp = new Emp();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name= ");
        String a = sc.nextLine();
        emp.name = a;
        System.out.print("enter department= ");
        String b = sc.nextLine();
        emp.department = b;
        System.out.print("enter roll= ");
        int c = sc.nextInt();
        emp.roll = c;
        sc.close();
        emp.printing();
    }

    static class Emp {
        public String name;
        public int roll;
        public String department;

        public void printing() {
            System.out.println("Name: " + this.name);
            System.out.println("Department: " + this.department);
            System.out.println("Roll: " + this.roll);
            System.out.println("Thanks");
        }
    }
}
