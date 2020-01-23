import java.lang.*;
import java.util.*;
class himilo
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of the array  ");
        int size=s.nextInt();
        int a[]=new int [size];
        System.out.println("Enter the elements :");
        for(int i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
        s.close();
        int max_val = a[0];
	int min = a[0];
	for(int i = 1; i < a.length; i++)
	{
		if(a[i] > max_val)
			max_val = a[i];
		else if(a[i] < min)
			min = a[i];
	}
    int c=max_val-min;
     System.out.println("the difference of the largest and the smalllest are"+c);
    }
}
