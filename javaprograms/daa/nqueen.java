import java.lang.*;
import java.util.*;
class nqueen
{
    static void printsolution(int board[][])
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean solvenqueen_(int board[][])
    {

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int board[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],0);
        }
       boolean b= solvenqueen_util(board);
      if(b)
      printsolution(board);
    }
}