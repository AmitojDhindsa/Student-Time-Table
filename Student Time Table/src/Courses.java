
public class Courses {
	String CourseName;
	String Coursecode;
	public Courses( String coursename, String coursecode)
	{
		super();
		this.CourseName = coursename;
		this.Coursecode= coursecode;
		
	}
	 public void displayCourseInfo() {
		 System.out.println("Course Name :" +CourseName);
		 System.out.println("Course code :" +Coursecode);
	 }

}