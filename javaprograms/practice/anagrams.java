import java.util.*;
class anagrams
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s2=sc.next();
        HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
        HashMap<Character,Integer> h2=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(!h1.containsKey(s.charAt(i)))
            {
                h1.put(s.charAt(i),1);    
            }
            else
            {
                h1.put(s.charAt(i),h1.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            if(!h2.containsKey(s2.charAt(i)))
            {
                h2.put(s2.charAt(i),1);    
            }
            else
            {
                h2.put(s2.charAt(i),h2.get(s2.charAt(i))+1);
            }
        }
        boolean b=false;
        for(int i=0;i<s2.length();i++)
        {
            if(h1.containsKey(s2.charAt(i)))
            {
                if(h1.get(s2.charAt(i))==h2.get(s2.charAt(i)))
                {
                      b=true;
                }
                else
                {
                    b=false;
                    break;
                }
            }
            else
            {
                b=false;
                break;
            }
        }
        if(b)
        System.out.println("Yes");
        else
        System.out.println("-1");
    }
}