import java.lang.*;
import java.util.*;
class binarysearchoriginal
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int key=0;
        System.out.println("Enter the key to search");
        key=sc.nextInt();
        int choice=0;
        System.out.println("Please enter your choice ");
        System.out.println("1  Iterative BinarySearch");
        System.out.println("2  Recursive BinarySearch");
        choice =sc.nextInt();
        switch(choice)
        {
            case 1:
            binaryiter b=new binaryiter();
            b.binarys(a, 0, a.length, key);
            break;
            case 2:
            binaryrec b1=new binaryrec();
            b1.binary_recurse(a, 0, a.length, key);
            
                    
        }
    }

}