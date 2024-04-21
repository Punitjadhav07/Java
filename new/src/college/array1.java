5

import java.util.*;
public class array1 {
   
	public static void main(String[] args) {
		  int a[] = new int [10];
		  int i,n;
		  System.out.println("enter the how many element :");
		  Scanner sc = new Scanner(System.in);
		   n=sc.nextInt();
		  System.out.println("enter the element :");
		  for(i=0;i<n;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  System.out.println("Array:");
		  for(i=0;i<n;i++)
		  {
			  System.out.print(+a[i]+ " ");
		  }
		// TODO Auto-generated method stub

	}

}
    

