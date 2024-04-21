import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc= new Scanner(System.in);
        System.out.print("enter =");
        int a= sc.nextInt();
        int rev=0;
        int rem;
        while(a!=0){
            rem= a%10;
            rev= (rev*(10+rem));
            a=a/10;


        }
        if(rev==a)
        {
            System.out.print("pallindrome");
        }
        else
        {
            System.err.println("nope"); 
        }
        sc.close();



    }
}
