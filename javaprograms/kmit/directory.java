import java.io.*;
import java.util.Scanner;
class directory
{
public static void main(String[] args) throws IOException {
String directoryname;
File directory;
System.out.println("Enter any directory :");
Scanner sc = new Scanner(System.in);
directoryname=sc.nextLine();
directory= new File(directoryname);
if(directory.exists()==false)
{
    System.out.println("There is no such directory name");
}
else if(directory.isDirectory()==false)
{
    System.out.println("There is no such directory");
}
else
{
    getlist(directory,"");
}
}

static void getlist(File dir,String indent)
{
    String files[];
    System.out.println(indent+"Directory-"+dir.getName()+":");
    indent+="    ";
    files=dir.list();
    for (int i=0;i<files.length;i++)
    {
        File f=new File(dir,files[i]);
        if(f.isDirectory())
           getlist(f,indent);
           else
           System.out.println(indent+files[i]);

    }
}}



