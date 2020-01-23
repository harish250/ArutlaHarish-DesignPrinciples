import java.io.*;
import java.lang.*;
import java.util.*;
class Student implements Serializable
{
    int rollno;
    String name;
    double height,weight;
    Student(int  rollno,String name,double height,double weight)
    {
            this.rollno=rollno;
            this.name=name;
                
            this.height=height;
            this.weight=weight;
    }
    int getrollno()
    {
        return rollno;
    }
    String getname()
     {
         return name; 
     }
     double getheight()
     {
         return height;
     }
     double getweight()
     {
         return weight;
     }
     public String toString()
     {
         return name+"  "+rollno+" "+height+" "+weight+" ";
     }
}
class driver    
{    
    static void write_records(String filename,int n) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        FileOutputStream fout=new FileOutputStream(filename);
        ObjectOutputStream out=new ObjectOutputStream(fout);
        System.out.println("Enter the Details");

        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the Rollno ");
            int rollno=sc.nextInt();
            System.out.println("Enter the Name");
            String name=sc.next();
            System.out.println("Enter the Height ");
            double height=sc.nextDouble();
            System.out.println("Enter the Weight");
            double weight=sc.nextDouble();
            Student s=new Student(rollno, name, height, weight);
            out.writeObject(s);
        }
        
    }
    static void read_records(String filename) throws IOException,ClassNotFoundException
    {
        FileInputStream fin=new FileInputStream(filename);
        ObjectInputStream oin=new ObjectInputStream(fin);
        
        while(oin.available()!=-1)
        {   
            System.out.println(oin.readObject());
        }
    }
    
    public static void main(String[] args) {
      
      try
      {
        Scanner sc=new Scanner(System.in);
       

       System.out.println("1 WRITE THE RECORD");
       System.out.println("2 READ THE RECORD");
       System.out.println("3 EXIT "); 
       System.out.println("Enter your choice ");
       int choice=sc.nextInt();

       
       switch(choice)
       {
           case 1:
           System.out.println("Enter the name of the file where you want to write the file ");
           String filename=sc.next();
           System.out.println("Enter the number of records ");
           int n=sc.nextInt();
           write_records(filename, n);
           break;
           case 2:
            System.out.println("Enter the file name to read the records");
            String filename1=sc.next();
            read_records(filename1);
            break;
            case 3:
            break;
       }
    
    }
    catch(Exception e)
    {
        ;
    }
    }
    }
