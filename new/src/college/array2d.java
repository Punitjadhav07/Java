
import java.util.Scanner;
public class array2d {
	public static void main(String[] args)
	{
		int j,i,r,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Rows:");
		r = sc.nextInt();
		System.out.println("How many Columns:");
		c = sc.nextInt();
		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		System.out.println("Enter the elements of matrix A:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of matrix B:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		int res[][] = new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				res[i][j] = a[i][j] - b[i][j];
			}
		}
		
		System.out.print("Result is:");
		System.out.printf("\n");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.printf("%d\t",res[i][j]);
			}
			System.out.printf("\n");
		}
		
	}

}
    

