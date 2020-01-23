package kmit;
 public class student
{
            int sno;
        String sname;
        student(int sno, int sname)
        {
            this.sno=sno;
            this.sname=sname;

        }
        void display()
        {
            System.out.println(sno);
            System.out.println(sname);
        }
}
