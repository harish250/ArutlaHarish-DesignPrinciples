import java.util.*;
class pattern2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,k;
        for( i=1;i<=n;i++)                          //this looop is to iterate through rows
        {
            for( j=1;j<=n-i+1;j++)                //this one is for the 1234
                                                                    //  123
            {                                                     //    12
                                                                 //     1
                System.out.print(j);
            }
            if(i>=2)                                 //this for printing "#" we print only if we are in the second row 
            {
                for(int l=0;l<2*i-2;l++)             //by understanding the number of #`s in the pattern the # are printed for 2*rows-2 times
                {
                    System.out.print("#");
                }
            }
            for( k=j-1;k>=1;k--)              //this is for the other triangle 4321
            System.out.print(k);                                          //    321
                                                                            //   21
                                                                             //   1              
            System.out.println();
        }
    }
}