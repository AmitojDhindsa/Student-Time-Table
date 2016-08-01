
public class Timetable {
	String CourseDay;
	String Coursecode;
	String Totrialtime;
	public Timetable(String Courseday, String coursecode, String totrialtime) {
		super();
			this.CourseDay = Courseday;
		this.Coursecode = coursecode;
		this.Totrialtime= totrialtime;
	}
	public void displayTimetable() {
		 System.out.println("Course Day :" +CourseDay);
		 System.out.println("Course Code:" +Coursecode);
		 System.out.println("Totrial Time:" +Totrialtime);

}
}