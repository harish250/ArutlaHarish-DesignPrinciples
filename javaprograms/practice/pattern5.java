    import java.util.*;
    class pattern5
    {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<n;i++)     //this is for the upper part i represents row
            {
            
                for(int k=i;k>=0;k--) //spacing in the pattern
                {
                    System.out.print(" ");
                }
            
                for(int j=n-i;j>0;j--) //for printing the #
                {
                    System.out.print("# ");
                }
                if(i==n-1)       //this is to skip new line at the joint of the pattern
                continue;
                System.out.println();
            }
            for(int i=0;i<=n;i++) //this is for the lower region
            {
                for(int k=n;k>=i;k--)  //spacing
                {
                    System.out.print(" ");
                }
                for(int j=0;j<i;j++)   //printing # symbol
                {
                    System.out.print("# ");
                }
                System.out.println();
            }

        }
    }