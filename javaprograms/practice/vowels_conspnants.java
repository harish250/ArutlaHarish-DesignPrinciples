import java.util.*;
class vowels_conspnants
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        String temp="";
        for(int i=0;i<arr.length;i++)
        {
            temp+=arr[i];
        }
        String result = "";
        System.out.println(temp);
        String vowels[]="a,e,i,o,u,A,E,I,O,U".split(",");
        List<String>vowel=Arrays.asList(vowels);
       for(int i=0;i<temp.length();i++)
       {
        if(vowel.contains(s.charAt(i)+"") && !vowel.contains(s.charAt(i+1)+""))
        {
            result+="V";
        }
        else if(!vowel.contains(s.charAt(i)+"") && vowel.contains(s.charAt(i+1)+""))
        {
            result+="C";
        }
        //   else if(vowel.contains(s.charAt(i)+"") && vowel.contains(s.charAt(i+1)+""))
        //    {
        //         result+="V";
        //         i++;
        //    }
        //    else if(!vowel.contains(s.charAt(i)+"") && !vowel.contains(s.charAt(i+1)+""))
        //    {
        //        result+="C";
        //        i++;
        //    }

       }
       System.out.println(result);

    }
}