import java.util.*;
class Students{
	int roll;
	String name;
	Students(int Roll, String Name){
		this.name=Name;
		this.roll=Roll;
	}
	void returndata(){
	System.out.println(name);
	System.out.println(roll);
	}
}
class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		int n;
		System.out.print("enter number of students=");
		n=sc.nextInt();
		Students s[]=new Students[n];
		
		for(int i=0;i<n;i++){
		    int a;
		    String b;
			System.out.print("enter name =");
			b=sc.next();
			System.out.print("enter roll =");
			a=sc.nextInt();
			s[i]= new Students(a,b);
		}
		for (int j=0;j<n;j++){
			s[j].returndata();
		}
    }
}
			