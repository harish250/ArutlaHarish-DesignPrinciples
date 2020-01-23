import java.util.*;
class Solution {
    public static void sortColors(int[] nums) {
        int count[]=new int[3];
        Arrays.fill(count,0);
        for(int i=0;i<nums.length;i++)
        {
             count[nums[i]]++;
        }
  int new_array[]=new int[nums.length];
        int index=0;
        for(int i=0;i<count.length;i++)
        {
            for(int j=0;j<count[i];j++)
            {
                new_array[index]=i;
                index++;
            }
        }

    System.out.print("[");
        for(int i=0;i<new_array.length;i++)
        {      if(i==new_array.length-1)
              System.out.print(new_array[i]);
         else
            System.out.print(new_array[i]+",");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        sortColors(arr);
    }
}