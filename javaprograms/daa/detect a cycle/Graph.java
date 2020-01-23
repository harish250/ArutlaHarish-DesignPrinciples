import java.util.*;
import java.lang.*;
class Graph
{   
    int V,E;
    Edge edge[];
    class Edge
    {
        int source,dest;
    };
    
    Graph(int v, int e)
    { 
       V=v;
       E=e;
       edge=new Edge[E];
       for(int i=0;i<e;i++)
          edge[i]=new Edge();
    }
    int find(int parent[],int i)
    {
        if(parent[i]==-1) //this mean that it "i" is a disjoint i.e it does not have any parent
        return i;
         return find(parent, parent[i]); //the value of i is a subset of another set
    }
    void Union(int parent[],int x,int y) //function to union two disjoint sets
    {
        int xset=find(parent, x); //if x itself is a set the find will return x else it finds until it finds -1 or the parent
        int yset=find(parent,y);
        parent[xset]=yset;   //we make y to be the child of x 
    }
    int isGraph(Graph graph)
    {
      int parent[]=new int[graph.V]; //creating a parent array for disjoint sets
      Arrays.fill(parent,-1);   //initialise to -1
      for(int i=0;i<graph.V;i++)
      {
          int x=find(parent, graph.edge[i].source); //we find to which they belong 
          int y=find(parent,graph.edge[i].dest);
          if(x==y)  //if source and dest belong to same set parent[x]==parent[y]
            return 1; // 1 to say that there is a cycle
        graph.Union(parent, x, y);
      }
      return 0;
    }
    public static void main(String[] args) {

/*                       "O"
                  0--------------1
                  |              |
                  |              |              
                  |              | "I"
                  |              |
                  |              |
                  3--------------2
                        "II"
                        
*/

        int v=4,e=4;
        Graph g=new Graph(v,e);
        g.edge[0].source=0;
        g.edge[0].dest=1;

        g.edge[1].source=1;
        g.edge[1].dest=2;

        g.edge[2].source=2;
        g.edge[2].dest=3;

        // g.edge[3].source=2;
        // g.edge[3].dest=0;

        if(g.isGraph(g)==1)
        System.out.println("Graph has a cycle");
        else
        System.out.println("There is not cycle ");
        }
}