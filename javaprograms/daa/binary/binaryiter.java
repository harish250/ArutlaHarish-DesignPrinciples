import java.util.*;
import java.lang.*;
class binaryiter
{
    void binarys(int arr[],int low,int high,int key)
    {
        
        
        while(low<=high)
        {int mid=(low+high)/2;
            if(arr[mid]<key)
            {
                low=mid+1;
            }
           else if(arr[mid]==key)
            {
                System.out.println("The element found at "+mid);
                  for(int i=mid;i>=0;i--)
                  {
                      
                      if(arr[i]!=arr[mid])
                      {
                          System.out.println("First occurence  "+(i+1));
                          break;
                      }
                  }
                  int count=0;
                for(int i=mid;i<arr.length ;i++)
                {
                 if(arr[i]==key)
                 {
                  count++;
                 }
                }
                System.out.println("The last occurence "+((mid+count)-1));
                  break;
            }
          else if(arr[mid]>key)
          {
              high=mid-1;
          }
        }
        }
        
        
}