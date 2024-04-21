public class primeno {
    public static void main(String[] args) {
        int i,c,k,sum=0;
        for(i=1;i<=50;i++)
        {
            c=0;
            for(k=1;k<=i;k++)
            {
                if(i%k==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                sum = sum + i;
            }
        
    }
    System.out.println("sum of prime number="+sum);
}

}

