/*Read one character at a time from the file ex1.txt, convert to uppercase and then write onto the file abc2.txt. Display the content of abc2.txt file.
[use BufferedInputStream and BufferedOutputStream classes].


@admin:

create the following file 

ex1.txt
shivaram

Solution:
*/

import java.io.*;
class FileCopy2
{
   public static void main(String[] args)throws IOException
   {
     int ch;
     
     FileInputStream fis=null,fis2=null;
     FileOutputStream fos=null;
     BufferedInputStream bis=null,bis2=null;
     BufferedOutputStream bos=null;  
     //Attach file name to FileInputStream
     fis = new FileInputStream("ex1.txt");
     bis=new BufferedInputStream(fis);
       //Attach file name to FileOutputStream
    fos=new FileOutputStream("abc2.txt");
    bos=new BufferedOutputStream(fos);
    //Read characters from bis into ch,convert to uppercase and write onto bos,repeat this till end  of the file is reached
    while(true)
    {
      ch=bis.read();
       
       if(ch==-1)
          break;
       ch=ch-32;
       bos.write(ch);
    }

    bis.close();
    bos.close();

    fis2=new FileInputStream("abc2.txt");
    bis2=new BufferedInputStream(fis2);
  //  System.out.println("The content of abc.txt file is:");

    //Read characters from fis2 into ch and write onto the monitor,repeat this till end of the file is reached
    while(true)
    {
        ch=bis2.read();
       
       if(ch==-1)
          break;
        System.out.print((char)ch);
    }
   bis2.close();
}
}

/*
input: no input
output:
SHIVARAMê
*/
