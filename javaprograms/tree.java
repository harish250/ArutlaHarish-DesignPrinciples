import java.util.*;

class student
{
    String name;
    Double grade;
    student(String nam,Double g)
    {
        name=nam;
        grade=g;
    }
    void display()
    {
 System.out.println("Name = "+name);
 System.out.println("grade = "+grade);
    }


}
class A implements Comparator <student>
{
public int compare(student s1,student s2)
{
if(s1.grade<s2.grade)
return 1;
else
return -1;
}
}
class tree
{
public static void main(String[] args) {
    TreeSet <student> t=new TreeSet<student>(new A()); 
    t.add(new student("Waris",9.8));
    t.add(new student("Govind",10.0));
    t.add(new student("harish",8.9));
    t.add(new student("Vishnu Joshi",10.0));
    for (student s : t) {
        s.display();
        
    }

}
}
