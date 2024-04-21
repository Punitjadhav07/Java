import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 1) Hello World
        System.out.println("Hello World");

        // 2) If-else statement
        int x = 10;
        if (x < 20) {
            System.out.println("x is less than 20");
        } else {
            System.out.println("x is greater than or equal to 20");
        }

        // 3) Do-while loop
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        // 4) While loop
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        // 5) For loop
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        // 6) Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);

        // 7) Else-if ladder
        int score = 85;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        // 8) Switch-case
        int month = 2;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            default:
                System.out.println("Invalid month");
        }

        // 9) 1D array
        int[] arr1D = {1, 2, 3, 4, 5};
        System.out.println("Element at index 2: " + arr1D[2]);

        // 10) 2D array
        int[][] arr2D = {{1, 2}, {3, 4}};
        System.out.println("Element at index [1][1]: " + arr2D[1][1]);

        // 11) StudentInfo class
        StudentInfo student1 = new StudentInfo("John", 20);
        student1.displayInfo();

        // 12) Area and Circumference of circle
        Circle circle = new Circle(5);
        circle.calculateArea();
        circle.calculateCircumference();

        // 13) Area and volume of cube
        Cube cube = new Cube(3);
        cube.calculateArea();
        cube.calculateVolume();

        // 14) Distance between two points
        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);
        System.out.println("Distance between points: " + point1.calculateDistance(point2));

        // 15) Employee info
        Employee employee = new Employee("John Doe", 30, "IT");
        employee.displayInfo();

        // 16) Default constructor (Box)
        Box box = new Box();
        box.displayInfo();

        // 17) Parameterized constructor (Rectangle)
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.displayInfo();

        // 18) Constructor overloading (PersonInfo)
        PersonInfo person1 = new PersonInfo("John Doe", 30);
        PersonInfo person2 = new PersonInfo();
        person1.displayInfo();
        person2.displayInfo();
        scanner.close();
    }
}

class StudentInfo {
    private String name;
    private int age;

    public StudentInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }

    public void calculateCircumference() {
        System.out.println("Circumference of circle: " + (2 * Math.PI * radius));
    }
}

class Cube {
    private int side;

    public Cube(int side) {
        this.side = side;
    }

    public void calculateArea() {
        System.out.println("Area of cube: " + (6 * side * side));
    }

    public void calculateVolume() {
        System.out.println("Volume of cube: " + (side * side * side));
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Point other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
    }
}

class Employee {
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

class Box {
    private int length;
    private int width;
    private int height;

    public Box() {
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    public void displayInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}

class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void displayInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}

class PersonInfo {
    private String name;
    private int age;

    public PersonInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonInfo() {
        this.name = "Unknown";
        this.age = 0;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
}
