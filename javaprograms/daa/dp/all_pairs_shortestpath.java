import java.util.*;
class all_pairs_shortestpath
{
    public static void solve_all_pair_shortest(int graph[][],int n)
    {
        int k=0,i=0,j=0;
        //k refers to intermediate node 
        //i and j to iterate through row and column
        for(k=0;k<n;k++)
        {
            for(i=0;i<n;i++)
            {
                for( j=0;j<n;j++)
                {
                    
                    graph[i][j]=Math.min(graph[i][j], graph[i][k]+graph[j][k]);
                }
            }
        }
        for(int row=0;row<n;row++)
        {
            for(int column=0;column<n;column++)
            {
                System.out.print(graph[row][column]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int n=sc.nextInt();
        int graph[][]=new int[n][n];
        System.out.println("Enter the initial adjacency matrix ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                graph[i][j]=sc.nextInt();
            }
        }
        solve_all_pair_shortest(graph,n);
    }
}