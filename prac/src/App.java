/* 
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("enter= ");
        a=sc.nextInt();
        sc.close();
        int b=2;
        if (b<a)
        {
            if(a%b==0)
            {
                System.out.print("not a prime number");
            }
            else{
                b+=1;
            }
        
        }
        else{
            System.err.print("prime");
        }

    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        sc.close();
        int b = 2;
        int flag = 0;
        if (a <= 1) {
            flag = 1;
        } else {
            while (b <= a / 2) {
                if (a % b == 0) {
                    flag = 1;
                    break;
                }
                b++;
            }
        }
        if (flag == 1) {
            System.out.println(a + " is not a prime number.");
        } else {
            System.out.println(a + " is a prime number.");
        }
    }
}*/
 
/*import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Print a welcome message
        System.out.println("Hello, World!");

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read an integer from the user
        int a;
        System.out.print("Enter a number: ");
        a = sc.nextInt();

        // Close the Scanner object to prevent resource leak
        sc.close();

        // Initialize a divisor to check for primality
        int b = 2;

        // Check if the entered number is less than 2
        if (a < 2) {
            // If the number is less than 2, it is not a prime number
            System.out.println("The number is not a prime number.");
        } else {
            // If the number is greater than or equal to 2
            // Check if the number is divisible by any number from 2 to a-1
            while (b < a) {
                // If the number is divisible by b, it is not a prime number
                if (a % b == 0) {
                    System.out.println("The number is not a prime number.");
                    // Exit the loop as we found a divisor
                    break;
                }
                // Increment the divisor to check the next number
                b++;
            }

            // If the loop completes without finding a divisor, the number is prime
            if (b == a) {
                System.out.println("The number is a prime number.");
            }
        }
    }
}*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        sc.close();

        int b = 2;
        if (a < 2) {
            System.out.println("The number is not a prime number.");
        } else {
            while (b < a) {
                if (a % b == 0) {
                    System.out.println("The number is not a prime number.");
                    break;
                }
                b++;
            }
            if (b == a) {
                System.out.println("The number is a prime number.");
            }
        }
    }
}


