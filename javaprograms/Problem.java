import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.lang.*;

class Problem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       String chocolates[]=sc.nextLine().split(" ");
       ArrayList<Integer> choco=new ArrayList<Integer>();
       for(int i=0;i<chocolates.length;i++)
       {
           choco.add(Integer.parseInt(chocolates[i]));
       }
       
       for(int j=choco.size()-1;j>0;j--)
       {
           int n1=choco.get(j);
           int n2 = choco.get(j-1);
           if(n1==n2)
           {
               choco.remove(j);
               choco.remove(j-1);
           }
           else if(n1<n2)
           {
               choco.remove(j);
               choco.remove(j-1);
               choco.add(n2-n1);
           }
           else
           {
            choco.remove(j);
               choco.remove(j-1);
               
               choco.add(n1-n2);
           }
       }
    
       System.out.println(choco.get(0));
    }
}