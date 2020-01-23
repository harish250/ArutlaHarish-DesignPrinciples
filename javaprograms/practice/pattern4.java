import java.util.*;
class pattern4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        System.out.println(0);
        for(i=0;i<n;i++)  //this represents the no of rows times as we see in each row we are repeating the numbers for row number of times
        {       
            for(k=i;k>=0;k--)         /* this loop is for  
                                                 9
                                                 89       
                                                 789                                 
                                                 6789
                                                 56789
                                                            */
            {                                                
                System.out.print(n-k);
            }
            System.out.print("0");          //middle zeroes
            for(j=0;j<=i;j++)                         /*
                                        9 
                                        98
                                        987 
                                        9876
                                        98765 
            */        
            {                                   
                System.out.print(n-j);
            }
            System.out.println();    //after printing each row move next row
        }

    }
}