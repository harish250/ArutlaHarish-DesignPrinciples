import java.util.*;
import java.lang.*;
class prime
{
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    ArrayList  <Integer> al=new ArrayList<Integer>() ;
     int size=sc.nextInt();
     for(int i=2;i<=size;i++)
     {boolean prime=true;
         for(int j=2;j<=Math.sqrt(i);j++)
         {
            if(i%j==0)
            {
                prime=false;
                break;
            }
         }
        if(prime)
        {
            al.add(i);
        }
     }
System.out.println(al);

}


}