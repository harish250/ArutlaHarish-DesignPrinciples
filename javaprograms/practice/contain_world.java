import java.util.*;
class contain_world
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String words[]=sc.nextLine().split(" ");
        String query=sc.next().toLowerCase();
        String ans="";
        boolean b=false;
        int lengths=query.length();
        for(int i=0;i<words.length;i++)
        {
          for(int j=0;j<query.length();j++)
          {
              if(words[i].contains(query.charAt(j)+""))
              {
                  lengths -= 1;
                  ans = words[i];
              }
          }
          if(lengths==0 && ans.length()!=0)
          break;
          else
          {
          lengths=query.length();
          }
        }
     if(lengths==0 && ans.length()!=0)
     System.out.println(ans);
     else
     System.out.println("-1");
    }
}
