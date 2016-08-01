
public class Student {
 String StudentName;
 int StudentID;
 String CourseName;
 String TimeTable;
 
public Student(String studentName, int studentID, String courseName) {
	super();
	StudentName = studentName;
	StudentID = studentID;
	CourseName = courseName;
}
 
 public void display(){
	 System.out.println("Student Name: "+StudentName);
	 System.out.println("Student ID : "+StudentID);
	 System.out.println("Course Name: "+CourseName);
 }

}