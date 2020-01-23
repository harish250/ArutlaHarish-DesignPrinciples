/*
*Write a java program to count the number of words in a given string?

Input & Output:
--------------
input =java api provides so many functions for string manipulation
output = 9

*/
import java.util.Scanner;
class Test2
{
    public static void main(String args[])
    {
        //write logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split(" ");
        System.out.println(words.length);
        
    }
}