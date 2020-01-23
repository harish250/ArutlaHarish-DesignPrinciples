import java.util.*;
class magic_string
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char arr[]=new char[26]; //array to store alphabets in reverse order z x y 
        for(int i=0;i<26;i++) 
        {
              arr[i]=(char)(122-i);    //as "a" starts at 97 and "z" ends at 122 
        }
        String res="";
        for(int i=0;i<s.length();i++)
        {
            int index=(int)s.charAt(i); //get ascii of the current char
           res += arr[index-97];    //we are subtracting the index-97 to get the actudl index in the arr 

        }
        System.out.println(res);
    }
}