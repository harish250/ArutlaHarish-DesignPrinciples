import java.util.*;
import java.lang.*;

class hash
{
    public static void main(String[] args) {
        
    
HashMap <String,Integer> h=new HashMap<String ,Integer>();
h.put("govind",100);
h.put("Harish",80);
h.put("Waris",90);
h.put("Vishnu",120);
Set <Map.Entry<String,Integer>> s1=h.entrySet();
for(Map.Entry<String,Integer> s : s1)
{
    System.out.println(s.getKey());
    System.out.println(s.getValue());
  
}
    }
}