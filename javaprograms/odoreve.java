import java.util.*;
import java.lang.*;
class odoreve
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    System.out.println("ENter the size of the array");
    int size=s.nextInt();
        int a[]=new int [size];
        int coo=0;
        int coe=0;
        for (int i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
        s.close();
        for(int i=0;i<size;i++)
        {
            if(a[i]%2==0)
            {
                coe++;
            }
            else if(a[i]%2!=0)
            {
                coo++;
            }
            
        }
        System.out.println("THe number of odd number are "+coo);
        System.out.println("The number of even numbers are "+coe);
        
    }
}