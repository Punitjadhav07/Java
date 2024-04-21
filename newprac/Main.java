/*
import java.util.*;
class Employee{
	int salary;
	String name;
	Employee(int Salary, String Name){
		this.name=Name;
		this.salary=Salary;
	}
	void returndata(){
	System.out.println(name);
	System.out.println(salary);
	}
}
class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		int n;
		System.out.print("enter number of employee=");
		n=sc.nextInt();
		Employee s[]=new Employee[n];
		
		for(int i=0;i<n;i++){
		    int a;
		    String b;
			System.out.print("enter name =");
			b=sc.next();
			System.out.print("enter roll =");
			a=sc.nextInt();
			s[i]= new Employee(a,b);
		}
		int r;
		int anew[]= new int[n];
		
		for (int j=0;j<n;j++){
			System.out.println(s[j].salary);
			r=s[j].salary;
			for(int k=0;k<n;k++){
			    anew[k]=r;
			    
			    
			}
		}
		Arrays.sort(anew);	
		for (int l=0;l<n;l++){
			System.out.println(anew[l]);
			
			
		}
    }
}
*/












import java.util.*;

class Employee {
    int salary;
    String name;

    Employee(int salary, String name) {
        this.name = name;
        this.salary = salary;
    }

    void returndata() {
        System.out.println(name);
        System.out.println(salary);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of employees = ");
        n = sc.nextInt();
        Employee[] s = new Employee[n];

        for (int i = 0; i < n; i++) {
            int salary;
            String name;
            System.out.print("Enter name = ");
            name = sc.next();
            System.out.print("Enter salary = ");
            salary = sc.nextInt();
            s[i] = new Employee(salary, name);
        }

        // Sort the employees based on salary
        Arrays.sort(s, Comparator.comparingInt(e -> e.salary));

        // Print the sorted employees
        for (Employee e : s) {
            System.out.println(e.name + " " + e.salary);
        }
    }
}

			