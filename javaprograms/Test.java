/*
Write a java program to find the no. of times each charecter repeated in a given String 

sample Input & Ouput:
---------------------
input = aaabbbbcccccbb
output =
The Character a has occurred 3 times
The Character b has occurred 6 times
The Character c has occurred 5 times

*/
/*
Write a java program to find the no. of times each charecter repeated in a given String 

sample Input & Ouput:
---------------------
input = aaabbbbcccccbb
output =
The Character a has occurred 3 times
The Character b has occurred 6 times
The Character c has occurred 5 times

*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        //write code here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] check =new int[s.length()];
        for(int i=0;i<check.length;i++)
        {
            check[i]=1;
        }
        for(int i=0;i<s.length();i++)
        {
            if(check[i]!=-1)
            {
            int count=1;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                    check[j]=-1;
                }
            }
            System.out.println("The Character "+s.charAt(i)+" has occurred "+count+" times");
        }}
        
    }
}