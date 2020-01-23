import java.util.*;
class rightshift
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int shift=sc.nextInt();
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            temp[(i+shift)%n]=arr[i];
        }
        for(int i:temp)
        System.out.print(i+" ");
    }
}