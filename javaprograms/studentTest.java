class Student
{
    String rno,name;
    int m1,m2,m3;
    void init(String rno,String name,int m1,int m2,int m3)
    {
        this.rno=rno;
        this.name=name;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    void display()
    {
        System.out.println(rno);
        System.out.println(name);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
class Result extends Student
{
    float total,average;
    String grade;
    void findgrade()
    {
        init(rno,name,m1,m2,m3);
        total=m1+m2+m3;
        average=total/3;
        System.out.println("Total = "+total);
        System.out.println("average = "+average);
        if(average>90)
        {
            grade="A";
            System.out.println(grade);
        }
        else if (average>80)
        {
            grade="B";
            System.out.println(grade);
        }
        else if (average>70)
        {
            grade="C";
            System.out.println(grade);
        }
    }
}
    class  studentTest
    {
        public static void main(String[] args) {
            Result r=new Result();
            r.init("17BD1A0585","Harish",80,90,90);
            r.display();
            r.findgrade();
        }
    }    
    

