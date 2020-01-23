
/* Write a Java program to create an abstract class named Shape that contains two integers and an empty method named print Area (). 

Provide three classes named Rectangle, Triangle, and Circle such that each one of the classes extends the class
Shape. 

Each one of the classes contains only the method print Area () that prints the area of the given shape.

Ouput:
-----
Area of Rectangle is 200
Area of Triangle is 525
Area of Circle is 12

*/

abstract class shape 
{ 
public int x, y; 
public abstract void printArea(); 
} 

class Rectangle extends shape 
{ 
public void printArea() 
{ 
System.out.println("Area of Rectangle is " + x * y); 
} 
} 

class Triangle extends shape 
{ 
public void printArea() 
{ 
System.out.println("Area of Triangle is " + (x * y) / 2); 
} 
} 

class Circle extends shape 
{ 
public void printArea()
{ 
System.out.println("Area of Circle is " + (22 * x * x) / 7); 
} 
} 

public class Abstract1
{ 
public static void main(String[] args) 
{ 
  Rectangle r = new Rectangle(); 
  r.x = 10; 
  r.y = 20; 
  r.printArea(); 

  Triangle t = new Triangle(); 
  t.x = 30; 
  t.y = 35; 
  t.printArea(); 

  Circle c = new Circle(); 
  c.x = 2; 
  c.printArea(); 
} 
} 



