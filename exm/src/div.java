import java.util.Scanner;

public class div {
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        System.out.print("enter your number= ");
        int num=a.nextInt();
        if(num%3==0 && num%7==0)
        {
            System.err.println(" entered integer no is divisible by 3 as well as by 7");
        }
        else{
            System.err.println(" entered integer no is not divisible by 3 as well as by 7");
        }
        a.close();

    }
    
}
