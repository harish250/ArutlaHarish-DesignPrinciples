// To demonstrate how to write formatted data on monitor.
import java.io.*;
class ConsoleDemo
{
public static void main(String args[]) throws Exception
{
Console console = System.console();

double radius = 2.0;

double area = Math.PI * radius * radius;

console.format("RESULT = %-10.2f %n",area);
}
}
