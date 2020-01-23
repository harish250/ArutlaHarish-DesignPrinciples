import java.lang.*;
import java.util.*;

// import jdk.nashorn.internal.runtime.SpillProperty;
class arjuna
{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int d=sc.nextInt();
     int s=sc.nextInt();
     Integer days[]=new Integer[d];
     Integer speed[]=new Integer[d];
     for(int i=0;i<d;i++)
     {
         days[i]=sc.nextInt();
         speed[i]=sc.nextInt();
     }
     List<Integer> a=new ArrayList<>(Arrays.asList(days));
     List<Integer> a1=new ArrayList<>(Arrays.asList(speed));
     int max=Collections.max(a1);
     ArrayList<Integer> key=new ArrayList<Integer>();
     ArrayList<Integer> value=new ArrayList<Integer>();
     
     value.add(max);
     key.add(a.get(a1.indexOf(max)));
     a.remove(a1.indexOf(max));
     a1.remove(a1.indexOf(max));
    
     int max2=0;
    for(int i=0;i<a.size();i++)
    {
 if(a1.get(i)>max2 && !key.contains(a.get(i)) )
 {
    max2=a1.get(i);  
 }
    }
    System.out.println(max+max2);

}
}