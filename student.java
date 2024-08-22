//instance variables:value is varied from obj to obj.
//inside class and outside method the variable is created.
public class student{
	String name="sai";
	int rollno=121;
	int marks=99;

	public static void main(String[] args){
		student s=new student();
		System.out.println("Student name is: "+s.name);
		System.out.println("Student Roll number: "+s.rollno);
		System.out.println("Student total marks: "+s.marks);
	}
	
}