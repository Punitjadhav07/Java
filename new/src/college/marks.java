import java.util.*;
public class marks {
    public static void main(String[] args) {
		System.out.println("Enter the marks:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        if(a>90)
		{
			System.out.println("A+");
		}
		else if(a>=75&&a<=89)
		{
			System.out.println("A");
		}
		else if(a>=60&&a<=74)
		{
            System.out.println("B");
		}
		else if ( a>= 46 && a<=59)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("FAIL!");
		}
	}

}

    

