import java.util.*;
import java.lang.*;
class subsets
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        ArrayList<String> subsets=new ArrayList<String>();
         
          for(int i=0;i<s.length();i++)
          {
              for(int j=i+1;j<s.length()+1;j++)
              {
                  subsets.add(s.substring(i,j));
              }
          }
          Collections.sort(subsets);
          System.out.println(subsets);
    }
}