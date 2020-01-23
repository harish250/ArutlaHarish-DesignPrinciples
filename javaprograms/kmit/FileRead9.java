//To demonstrate BufferedReader to read a line at a time.

import java.io.*;

class FileRead9
{
public static void main(String args[]) throws IOException
{
  FileReader fr=new FileReader("ex3.txt");
  
  BufferedReader br=new BufferedReader(fr);
  
  String s;
  
  System.out.println("The File Content is:");
  
  while((s=br.readLine())!=null)
      System.out.println(s);
  

  br.close();
}
}

