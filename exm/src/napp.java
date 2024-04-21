import java.util.Scanner;

public class napp {
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        System.out.print("enetr a number= ");
        int num=a.nextInt();
        a.close();
        if (num>0)
        {
            System.out.print("+ve ");
        }
        else {
            System.out.print("-ve");
        }


    }
}
