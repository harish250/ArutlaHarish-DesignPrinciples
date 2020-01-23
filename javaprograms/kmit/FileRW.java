/*(Q)Read int values from the file 'file1.dat' and write all even numbers into the file 'even.dat', odd numbers into the file 'odd.dat'.Display the contents of the file 'odd.dat'.

@admin:
ensure the file file1.dat is existing.

The contents of the file(11,22,33,44,55) should not be manually created.has to be written to the file using DataInputStream class writeInt().

solution:
*/
import java.io.*;
import java.util.*;

class FileRW
{
 public static void main(String[] args) throws IOException
 {
   int i,x;
   FileOutputStream fos1=new FileOutputStream("even.dat");
   DataOutputStream dos1=new DataOutputStream(fos1);
  
  FileOutputStream fos2=new FileOutputStream("odd.dat");
  DataOutputStream dos2=new DataOutputStream(fos2);

 //retieving the integer values from the file 
   FileInputStream fis=new FileInputStream("file1.dat");
   DataInputStream dis=new DataInputStream(fis);
   while(dis.available()>0)
    {
      x=dis.readInt();
      if(x%2==0)
          dos1.writeInt(x);
      else
          dos2.writeInt(x);  
    }
   dis.close();
   dos1.close();
   dos2.close();

   System.out.println("the odd numbers from odd.dat file:");
   FileInputStream fis2=new FileInputStream("odd.dat");
   DataInputStream dis2=new DataInputStream(fis2);
   while(dis2.available()>0)
     {
      x=dis2.readInt();
      System.out.print(x+" ");
      }
   dis2.close();
   }
}

/*
output:
the odd numbers from odd.dat file:
11 33 55
*/
