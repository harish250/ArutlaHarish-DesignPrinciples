import java.util.*;

class checker implements Comparator<Student>{
public int compare(Student s1,Student s2)
{
    if(s1.cgpa == s2.cgpa)
        return s1.fname.compareTo(s2.fname);
    if(s1.fname==s2.fname)
        return s1.id-s2.id;
    else
        return (int)(s1.cgpa-s2.cgpa);
}
}

 class Student{
	public int id;
	public String fname;
	public double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      Collections.sort(studentList, new checker());
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



