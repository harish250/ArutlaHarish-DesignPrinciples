import java.util.*;
class longest_palindrome
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String words[]=sc.nextLine().split(" ");
        String res="";
        int max_length=0;
        
        for(int i=0;i<words.length;i++)
        {
            String reverse=new StringBuilder(words[i]).reverse().toString();
            if(words[i].equals(reverse) && words[i].length()>max_length)
            {
                res = words[i];
                max_length=words[i].length();
            }
        }
        if(res.length()!=0)
        System.out.println(res);
        else
        System.out.println("null");
    }
}