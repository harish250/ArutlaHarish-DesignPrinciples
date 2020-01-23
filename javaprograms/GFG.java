/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int a[]=new int[t];
	    for(int j=0;j<t;j++)
		{
		int n=sc.nextInt();
		int x=sc.nextInt();
		String s=sc.next();
		int count=0;
		HashSet <Integer> h=new HashSet<Integer>();

		for(int i=0;i<s.length();i++)
		{
		h.add(x);	
		   if(s.charAt(i)=='L')
		   {
		       x=x-1;
			   h.add(x);
		   }
		   else
		   {
		       x=x+1;
			h.add(x);
		   }
		    
		}
        a[j]=h.size();
		}
		for(int k=0;k<t;k++)
		{
			System.out.println(a[k]);
		}
	}
}
