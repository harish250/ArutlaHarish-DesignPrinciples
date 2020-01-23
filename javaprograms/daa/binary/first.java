import java.util.*;
import java.lang.*;
class first 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int a[]=new int[len];
        System.out.println("Enter the elements ");
        for(int i=0;i<len;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the key to be searched ");
        int key=sc.nextInt();
        helper h=new helper();
    h.binarys(a,0,a.length-1,key);
        
    }
}
class helper
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
                  for(int i=mid;i>0;i--)
                  {
                      if(arr[i]!=arr[mid])
                      {
                          System.out.println("First occurence  "+(i+1));
                          break;
                      }
                  }
                  int count=0;
                for(int i=mid;i<arr.length;i++)
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