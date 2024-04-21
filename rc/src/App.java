import java.util.Scanner;

class Student{
    String Name;
    int Roll_no ;
    Student(String Name,int Roll_no){
        this.Name=Name;
        this.Roll_no=Roll_no;
    }
    void Return(){
        System.out.println(Name);
        System.out.println(Roll_no);
    
    }

}


public class App {
    public static void main(String[] args) throws Exception {
        Student arr[] = new Student[5];
        Scanner sc= new Scanner (System.in);
        String b;
        int a;
        for(int i=0;i<5;i++){
            
            System.out.print("name= ");
            b=sc.nextLine();
            System.out.print("roll=");
            a=sc.nextInt();
            sc.nextLine();
            arr[i]= new Student(b,a);


        }
        sc.close();
        for(int i=0;i<5;i++){
            arr[i].Return();
        }
        

    }
}

