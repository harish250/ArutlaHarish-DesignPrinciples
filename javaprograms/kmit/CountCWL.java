/*Q2) Read the content of the file ex2.txt, count and display number of characters,words and lines present in the File.

@admin:

create the following text file  (dont press enter after the third line)

ex2.txt
shiva rama krishna
younus shariff
thejaswitha

Solution:*/

import java.io.*;
import java.util.*;

class CountCWL
{
   public static void main(String[] args)throws IOException
   {
     int ch,ccount=0,wcount=0,lcount=0;
     FileInputStream fis=null;

     //Attach file name to FileInputStream
     fis = new FileInputStream("ex2.txt");
  
    //Read characters from fis into ch and check whether the character is a new line character
    // or space character or any other character.
    while((ch=fis.read())!=-1)
    {
        ccount++;
         if((char)ch==' ')
         wcount++;

        if((char)ch=='\n')
           {
             lcount++;
              wcount++;
           }
      }
   fis.close();
       
   System.out.println("Number of characters in the file:"+ccount);
   System.out.println("Number of words in the file:"+wcount);
   System.out.println("Number of lines in the file:"+lcount);
    }
}

/*
input: no input

output:
Number of characters in the file:46
Number of words in the file:6
Number of lines in the file:3
*/
