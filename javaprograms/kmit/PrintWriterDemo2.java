// To demonstrate how to write formatted data to the file.
import java.io.*;

class PrintWriterDemo2
{
public static void main(String[] args) throws Exception
{
PrintWriter pw = new PrintWriter("ex27.txt");

String s1="shiva",s2="Younus";

pw.printf("%2$s %1$s", s1,s2);

pw.close();
}
}

