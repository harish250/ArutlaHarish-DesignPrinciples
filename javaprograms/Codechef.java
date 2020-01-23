/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static int get_1(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			count++;
		}
		return count;
	}
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String s[]=new String[k];

		int a[]=new int[k];
		
		Arrays.fill(a, 0);	
		ArrayList<Integer> aral=new ArrayList<Integer>();
		for(int i=0;i<k;i++)

		{
			s[i]=sc.nextLine();

			String action[]=s[i].split(" ");
		String cliorclo=action[0];
		String inde=action[1];
		System.out.println(action.length);
			if(cliorclo.equals("CLICK"))
			{
				for(int j=0;j<n;j++)
				{
					if((Integer.parseInt(inde)-1)== j )
					{
						if(a[j]==0)
						a[j]=1;
						else 
						a[j]=0;
					}

				}
			}
			aral.add(get_1(a));
		}
		for(int i : aral)
		System.out.println(i);
	}
}

