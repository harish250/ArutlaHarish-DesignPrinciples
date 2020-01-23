import java.util.*;
class add_array
{
    static int[] get_digits(int sum) //this method is to give me the digits of a number
    {
    String strsumString=String.valueOf(sum);
    int arr[]=new int[strsumString.length()];

    for(int i=0;i<strsumString.length();i++)
    {
        arr[i]=Integer.parseInt(strsumString.charAt(i)+"");
    }
    return  arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();        
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        arr1[i]=sc.nextInt();

        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++)
        arr2[i]=sc.nextInt();

        ArrayList<Integer> res=new ArrayList<Integer>();
  int i=0;
        for(i=0;i<n;i++)
        {
            int sum=arr1[i]+arr2[i];        //first calculate the sum
            int digits[]=get_digits(sum);       //then get the digits
            for(int j=0;j<digits.length;j++)
            {
                  res.add(digits[j]);               //add all the digits to result
            }
        }
    
  for(int j=i;j<m;j++)       //search for remaining elements int the second array
  {
  int digits[]=get_digits(arr2[j]);    //if the remainig elements in the second array are having any two digit number
  for(int k:digits)  
  res.add(k);
  }
   for(int l:res)
   System.out.print(l+" ");


    }
}