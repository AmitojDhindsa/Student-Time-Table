import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice;
		// for the output
		System.out.println("A. View Student Info");
		System.out.println("B. View Course Info");
		System.out.println("C. View Student TimeTable");
		System.out.println("Enter Your Choice: ");
		choice = input.nextLine();

		if (choice.equals("A")) {
			Student S1 = new Student("Rajandeep Kaur Brar", 2163281, "Graduate Diplomia in Information Technology");
			S1.display();
			Student S2 = new Student("Harmandeep Kaur", 2164208 , "Graduate Diplomia in Information Technology");
			S2.display();
			Student S3 = new Student("Amitoj Dhindsa", 2163789, "Graduate Diplomia in Information Technology");
			S3.display();
			
		} else if (choice.equals("B")) {
			Courses c1 = new Courses("Project Management", "IT6268");
			c1.displayCourseInfo();
			Courses c2 = new Courses("Development and Software Testing", "IT7320");
			c2.displayCourseInfo();
			Courses c3 = new Courses("System Engineering", "IT7368");
			c3.displayCourseInfo();
			Courses c4 = new Courses("Logical DataBase Design", "IT6256");
			c4.displayCourseInfo();
			Courses c5 = new Courses("Information Mangement", "IT7345");
			c5.displayCourseInfo();

		} else if (choice.equals("C")) {
			Timetable t1 = new Timetable("Monday","IT6268", "8:00-9:00");
			t1.displayTimetable();
			Timetable t2 = new Timetable("Tuesday","IT7320", "10:00-12:00");
			t2.displayTimetable();
			Timetable t3 = new Timetable("Wednesday","IT7368","1:00-3:00");
			t3.displayTimetable();
			Timetable t4 = new Timetable("Thursday","IT6256", "2:00-4:00");
			t4.displayTimetable();

			Timetable t5 = new Timetable("Thursday","IT7345", "8:00-9:00");
			t5.displayTimetable();
		}
		else{
			System.out.println("Incorrect Values");
		}
		
	}

}
