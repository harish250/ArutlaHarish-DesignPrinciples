import java.util.*;
class sum_num
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int num=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            num+=Integer.parseInt(s.charAt(i)+"");
        }
        System.out.println(num);
    }
}