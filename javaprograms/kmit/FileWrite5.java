// To demonstrate FileWriter,Read characters from keyboard and write them onto a file.

import java.util.*;
import java.io.*;
class FileWrite5
{
 public static void main(String[] args) throws IOException
 {
   char ch;
   
   Scanner sc=new Scanner(System.in);
   
   FileWriter fw=new FileWriter("ex24.txt");
   
   System.out.println("enter a Line of characters");
   String s=sc.nextLine();
   
   for(int i=0;i<s.length();i++)
      fw.write(s.charAt(i));
   
   fw.close();

   }
}

