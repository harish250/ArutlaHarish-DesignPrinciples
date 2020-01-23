
import java.util.*;
class SumofSubsets
{

    void find_sum(int w[],int x[],int num,int index,int sum,int rem)
   {int i=0;
       x[index]=1;
              if(num+w[index]==sum)
              {
                  System.out.println("We have found the sum");
                  for(i=0;i<=index;i++)
                  {
                      if(x[i]==1)
                      System.out.print(w[i]+" ");
                  }
                  System.out.println();
              }
              else if((num+w[index]+w[index+1])<=sum)
              {
                  find_sum(w, x, num+w[index], index+1, sum,rem-w[index]);
              }
              if(((num+rem-w[index])>=sum) && ((num+w[index+1]))<=sum )
              {
                    x[index]=0;
                    find_sum(w, x, num, index+1, sum, rem-w[index]);
              } 
   }

    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the number of elements ");
             int n=sc.nextInt();
             int weights[]=new int[n+1];
             int bool[]=new int[n+1];
            //  Arrays.fill(bool, 0);
            System.out.println("Enter the elements "); 
            for(int i=1;i<n+1;i++)
            {
                weights[i]=sc.nextInt();
            }          
            System.out.println("Enter the sum u want from the given elements ");
            int sum=sc.nextInt();
            int total=0;
            for(int i=0;i<n;i++)
            {
                total+=weights[i];
            }      
           new SumofSubsets().find_sum(weights,bool, 0, 1, sum,total);
    }
}