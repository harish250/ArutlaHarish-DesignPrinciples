/*(Q)The Serializable class Student is with 2 attributes rno(String), name(String).The details(rno,name) of 3 students with roll numbers 15BD1A0501, 15BD1A0502, 15BD1A0503 is saved in the file 'student.dat'.
Display the name of the student for the given roll number.

Student.java */

import java.io.*;

public class Student implements Serializable
{
   public String rno;
   public String name;

   public Student(String rno,String name)
   {
     this.rno=rno;
     this.name=name;
   }
   public String toString()
   {  
      return "ROLL NO="+rno+" NAME="+name;
   }
}


ObjectIO.java*/

import java.io.*;
import java.util.*;

class FileRead6
{
   public static void main(String args[]) throws IOException,ClassNotFoundException
   {
/*
      FileOutputStream fos=new FileOutputStream("student.dat");
      ObjectOutputStream oos=new ObjectOutputStream(fos);
       
      Student s1=new Student("15BD1A0501","shiva");
      oos.writeObject(s1);
      Student s2=new Student("15BD1A0502","Younus");
      oos.writeObject(s2);
      Student s3=new Student("15BD1A0503","kiran");
      oos.writeObject(s3);
      oos.close();*/

      Scanner s=new Scanner(System.in);
      System.out.println("enter the student roll number:");
      String no=s.next();
      String sname="";
      FileInputStream fis=new FileInputStream("student.dat");
      ObjectInputStream ois=new ObjectInputStream(fis);
      Student ss;
      int found=0;
      while(true)
         {
           try
           { 
           ss=(Student)ois.readObject();
                 
           if(no.equals(ss.rno))
              {
               found=1;
               sname=ss.name;
               break;
               }
           }
           catch(EOFException e)
           {
              break;
           } 
         }

      ois.close(); 
      if(found==0)
          System.out.println("No such student found");
      else
          System.out.println("STUDENT NAME="+sname);
     }
}

/*
input1:
enter the student roll number:
15BD1A0503
output1:
STUDENT NAME=kiran
input2
enter the student roll number:
15BD1A0504        
output2:
No such student found
*/
