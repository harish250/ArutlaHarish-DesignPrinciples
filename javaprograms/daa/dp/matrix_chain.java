import java.util.*;
class matrix_chain
{
    public static void solve_matrix_multiplication(int orders[],int n)
    {
        int matrix[][]=new int[n][n]; //matrix to store the cost of multiplication of each matrices
        for(int i=0;i<n;i++)
        {
            Arrays.fill(matrix[i],0);
        }
        int i=0,j=0,diff=0,q=0,min=0;
// q for storing intermediate mulitplication
         //i refers to row , j refers to column ,diff refers to j-i  
        /* 
           j          
        i   "0" 0 0 0
            0 "0" 0 0
            0 0 "0" 0
            0 0 0 "0"
        */
        
        for(diff=1;diff<n-1;diff++)
        {
        for(i=1;i<n-diff;i++)
        {
            j=i+diff;    //j is just sum of i and d by just observing
            min=Integer.MAX_VALUE;
            for(int k=1;k<=j-1;k++)
            {
                q=matrix[i][k]+matrix[k+1][j]+orders[i-1]*orders[j]*orders[k];
                if(q<min)
                {
                    min=q;
                }
            }
            matrix[i][j]=min;
        }
        }
 System.out.println("The min cost of multiplication is "+matrix[1][n-1]);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of matrices");
        int n=sc.nextInt();
        int orders[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the D"+i);
            orders[i]=sc.nextInt();
        }
        solve_matrix_multiplication(orders,n);
    }
}