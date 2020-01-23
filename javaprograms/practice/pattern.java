import java.util.*;
class pattern
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1,j=n/2;i<=n/2 && j >= 1;i++,j--)
        {
            for(int k=1,l=n/2;k<=n/2 && l>=1 ;k++,l--)
            {
                if(i==k) 
                System.out.print(i);
                else if(j==l)
                System.out.print(j);     
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}