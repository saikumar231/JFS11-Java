//static variables: values are not varied from obj to obj
//static keyword is defined inside class,outside method.
//directly call in main method by using class name/obj reference/ static context(with out any reference)
public class student1{
	static String name="kumar";
	static int rollno=102;
	static int marks=98;
	public static void main(String[] args){
		student1 s=new student1();  //obj creation
		System.out.println("Student name is: "+name);	//directly static content
		System.out.println("Student rollnumber is: "+s.rollno);  //by using obj reference
		System.out.println("Student marks is: "+student1.marks); //by using class name
	}
}