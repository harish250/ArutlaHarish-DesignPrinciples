import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class happy
{
    public static void main(String[] args)throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
int a[]=new int[4];
int i=0;
while(n>0)
{
    a[i]=n%2;
    n /= 2;
    i++;
}


int m = n-1,j=0;
int b []=new int[4];
while(m>0)
{
b[j]=m%2;
m /= 2;
j++;
}
for(int k=0;k<a.length;k++)
{
    if(a[k]==0)
    {
        a[k]=1;
    }
    else
    {
        a[k]=0;
    }
}
int v=0;
for(int h=0;h<a.length;h++)
{
    if(a[h]==b[h])
    {
    v++;
    }
}
if( v == a.length)
{
    System.out.println("YES");
}
else
{
    System.out.println("NO");
}
}
}