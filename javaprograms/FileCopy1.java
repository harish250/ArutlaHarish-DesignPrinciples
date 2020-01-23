/*(Q)Copy the content of the file ex1.txt to abc.txt a byte at a time.Display the content of abc.txt file.

@admin:

create the following file 

ex1.txt
shivaram

Solution:
*/

import java.io.*;
class FileCopy1
{
   public static void main(String[] args)throws IOException
   {
     int ch;
     
     FileInputStream fis=null,fis2=null;
     FileOutputStream fos=null;
  
     //Attach file name to FileInputStream
     fis = new FileInputStream("ex1.txt");
       //Attach file name to FileOutputStream
    fos=new FileOutputStream("abc.txt");

    //Read characters from fis into ch,convert to uppercase and write onto fos,repeat this till end  of the file is reached
    while(true)
    {
      ch=fis.read();
       
       if(ch==-1)
          break;
       fos.write(ch);
    }

    fis.close();
    fos.close();

    fis2=new FileInputStream("abc.txt");

  //  System.out.println("The content of abc.txt file is:");

    //Read characters from fis2 into ch and write onto the monitor,repeat this till end of the file is reached
    while(true)
    {
        ch=fis2.read();
       
       if(ch==-1)
          break;
        System.out.print((char)ch);
  
    }

    fis2.close();
}
}

/*

input: no input

output:
SHIVARAMê
*/
