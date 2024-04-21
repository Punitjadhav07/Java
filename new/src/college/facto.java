import java.util.*;

class facto {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int n= sc.nextInt();
        int i,fact=1;
        if(n==1){
            System.out.println("factorial:"+fact);
        }
        else{
            for(i=1;i<=n;i++)
            {
                fact=fact*i;
            }
        
        System.out.println("factorial:"+fact);
        }


    }
    
}
