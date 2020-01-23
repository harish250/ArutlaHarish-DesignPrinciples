import java.util.*;
import java.lang.*;
import java.io.*;
class student
{
    int id;
    String name;
    student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.id+" "+this.name;
    }
}
class mergeobject
{
    static void mergesort(student s[],int high)
    {
        int mid;
        student left[];
        student right[];
        if(s.length<2)
        return ;
        mid=high/2;
        left=new student[mid];
        for(int i=0;i<mid;i++)
        {
            left[i]=s[i];
        }
         right=new student[high-mid];
        for(int j=mid;j<high;j++)
        {
            right[j-mid]=s[j];
        }
        mergesort(left, mid);
        mergesort(right, high-mid);
        merge(s,left,mid,right,high-mid);

    }
    static void merge(student org[],student left[],int leftcount,student right[],int rightcount)
    {
        int i=0,j=0,k=0;
        while(i<leftcount && j<rightcount)
        {
            if(left[i].id < right[j].id)
            {
                org[k]=left[i];
                i++;
                k++;
            }
            else
            {
                org[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<leftcount)
        {
            left[i]=org[k];
            i++;
            k++;
        }
        while(j<rightcount)
        {
            right[j]=org[k];
            j++;
            k++;
        }
    }
     public static void main(String[] args) throws FileNotFoundException {
        FileReader file1=new FileReader("names1.txt"); 
        Scanner sc1=new Scanner(file1);
        student s[]=new student[7];
int i=0;
       while(sc1.hasNext())
       {
          
           String strobject[]=sc1.nextLine().split(" ");
           int id=Integer.parseInt(strobject[0]);
           String name=strobject[1];
           s[i]=new student(id,name);
           i++;   
       }
       FileReader file2=new FileReader("names2.txt"); 
       Scanner sc2=new Scanner(file2);
     int j=0;
      while(sc2.hasNext())
      {
        
          String strobject[]=sc2.nextLine().split(" ");
          int id=Integer.parseInt(strobject[0]);
          String name=strobject[1];
          s[i]=new student(id,name);
            i++; 
      }
      mergesort(s,s.length);
      for(student st:s)
      {
          System.out.println(st);
      }
     }
}