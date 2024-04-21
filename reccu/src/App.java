import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the term = ");
        int a = sc.nextInt();
        System.out.println("factorial=" +rec(a));
        sc.close();
        
        
    }
public static int rec (int num){
    if(num==1) 
    return 1;
    else{
            int fact=num*rec(num-1);
            return fact;
    }
}
}
