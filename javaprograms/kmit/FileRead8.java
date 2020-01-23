// To demonstrate FileReader.
import java.io.*;

class FileRead8
{
   public static void main(String[] args) throws Exception
   {
     int ch;
     
     FileReader fr=null;
     
     //Attach file name to FileReader
     fr = new FileReader("ex1.txt");

      System.out.println("Contents of the file....");
     
    //Read characters from fr into ch,and display it on the screen,repeat this till end of the file is reached

    while(true)
    {
        ch=fr.read();
        if(ch==-1)
             break;
       System.out.print((char)ch);
    }

    //close the file handle.
    fr.close();
}
}

