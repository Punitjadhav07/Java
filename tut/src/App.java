import java.util.Scanner;

    public class App {
        public static void main(String[] args) throws Exception {
          Scanner sc=new Scanner(System.in);
          Student students[]=new Student[2];
          for(int i=0;i<students.length;i++){
            System.out.print("Enter name"+(i+1)+"=");
            String a= sc.nextLine();
            System.out.print("Enter Roll"+(i+1)+"=");
            int b=sc.nextInt();
            sc.nextLine(); // consume the newline character
            students[i]=new Student(a,b);
          }
          for (Student student : students) {
            System.out.println(student.returndata());
          }
          sc.close();
          
        }
    }
    class Student{
        int roll;
        String name;
        Student(String name, int roll){
            this.roll= roll;
            this.name= name;
        }
        String returndata(){
            return "Roll: " + roll + ", Name: " + name;
        }
    }
    