import java.util.*;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        
    
    Scanner d = new Scanner(System.in);
    System.out.print("ENTER= ");
    int a = d.nextInt();
    
    System.out.println(a);
    Scanner e = new Scanner(System.in);
    System.out.print("ENTER= ");
    int b = e.nextInt();
    System.out.println(b);
    Scanner f = new Scanner(System.in);
    System.out.print("ENTER= ");
    int c = f.nextInt();
    System.out.println(c);
    d.close();
    e.close();
    f.close();
    
    int sqrt=((b*b)-4*a*c);
    int newsqrt=(int)Math.sqrt(sqrt);
    int new1=(b+newsqrt/2*a);
    int new2=(b-newsqrt/2*a);
    System.out.println(new1);
    System.out.println(new2);
    
    }
    
} 
