import java.util.*;
import java.lang.*;
class sync
{
    synchronized void  print(int a,Boolean b1)
    
{   int product;     
    if (b1==true)
    {
        product=a*a;
        System.out.println("From thread1");
        System.out.println("Even number "+a+" squared "+product);
    }
    else
    {int cube=a*a*a;
        System.out.println("From thread2");
        System.out.println("odd number "+a+" cubed "+cube);
    }
    try
    {
        Thread.sleep(100);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    
}

}
class thread1 extends Thread
{
    boolean b=true;
 sync s;
 int a[];
 thread1(sync c,int a[])
 {
this.a=a;
     s=c;
 }   
 public void run()

 {
     for(int i=0;i<10;i++)
    {
     if(a[i]%2==0)
     s.print(a[i],b);
     else continue;
    }
 }
}
class thread2 extends Thread{
    boolean b=false;
    sync s;
    int a[];
    thread2(sync c,int a[])
    {
   this.a=a;
        s=c;
    }   
    public void run()
   
    {
        for(int i=0;i<10;i++)
       {
        if(a[i]%2!=0)
        s.print(a[i],b);
        else continue;
       }
    }
} 


class test
{
    public static void main(String[] args) {
        int a[]=new int [10];
        Random r =new Random();
        sync s1=new sync();
        for(int i=0;i<10;i++)
        {
         a[i]=r.nextInt(1000);
         
        }
        thread1 t1=new thread1(s1,a);
         thread2 t2=new thread2(s1,a);
        t1.start();
        t2.start();


    }
}