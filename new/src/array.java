import java.util.*;

public class array {
    public static void main(String[] args)
    {
        Scanner d = new Scanner(System.in);
        System.out.print("enetr 1st number=");
        int a=d.nextInt();
        System.out.print("eEnter 2nd number=");
        int b=d.nextInt();
        System.out.print("eEnter 3rd number=");
        int c=d.nextInt();
        if(a>b && a>c)
        {
            System.out.print("greatest="+a);
        
        }
        else
        if(b>a && b>c)
        {
            System.out.print("greatest="+b);
        
        }
        else
        {
            System.out.println("greatest="+c);
        }
        int e[]=new int[3];
        e[0]=a;
        e[1]=b;
        e[2]=c;
        int small=a;
        for (int i=0;i<e.length;i++)
        {
            if (small>e[i])
            {
                small=e[i];
            }
        }
        System.out.print("smallest="+small);
        d.close();



    }

    
}
