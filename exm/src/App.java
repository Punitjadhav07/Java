import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner a= new Scanner(System.in);
        System.out.print("Enter Basic Salary=");
        int bs=a.nextInt();
        float da=(float)(0.3*bs);
        float hra=(float)(0.1*bs);
        float gross=(float)(bs+da+hra);
        float tax=(float)(0.2*gross);
        float nets=(float)(gross-tax);
        a.close();
        System.out.println("bs"+bs);
        System.out.println("hra"+hra);
        System.out.println("tax"+tax);
        System.out.println("da"+da);
        System.out.println("nets"+nets);





    }
}
