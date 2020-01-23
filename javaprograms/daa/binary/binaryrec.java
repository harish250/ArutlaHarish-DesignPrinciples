import java.util.*;
import java.lang.*;
class binaryrec
{
    
    void binary_recurse(int a[],int low,int high,int key)
    {
        int mid;
        if(low<=high)
        {
         mid=(low+high)/2;
        if(a[mid]==key)
        {
            System.out.println("The element found at "+mid);
            for(int i=mid;i>=0;i--)
            {
                if(a[i]!=a[mid])
                {
                    System.out.println("First occurence  "+(i+1));
                    break;
                }
            }
            int count=0;
          for(int i=mid;i<a.length ;i++)
          {
           if(a[i]==key)
           {
            count++;
           }
          }
          System.out.println("The last occurence "+((mid+count)-1));
        
      }
        
        else if(a[mid]<key)
         binary_recurse(a, mid+1, high, key);
        else
         binary_recurse(a, low, mid-1, key);  
        }
        
    }
    
}