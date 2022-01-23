package week1.day1;



public class Student {
	public String studentName = "Rajalakshmi";
	private int studentRollno = 8301;
	public void college()
	{
		 String collegeName = " Kings College ";
		 
		System.out.println("College Name:"+collegeName);
		
	}
	private int marks()
	{
		int mark = 100;
		return mark;
	}
public static void main(String[] args) {
	Student obj = new Student();
	System.out.println("Student Name:" +obj.studentName);
	System.out.println("Roll Number:" +obj.studentRollno);
	obj.college();
	int m = obj.marks();
	System.out.println("Marks :"+m);
	
}
}
