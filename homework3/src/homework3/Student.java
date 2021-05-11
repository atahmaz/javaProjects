package homework3;

public class Student extends User {
	private String StudentNumber= "STU" +  this.getId();
	
	public Student() {
		super();
	}
	
	public Student(int id, String firstName, String lastName, int age, String mail) {
		super(id, firstName, lastName, age, mail);
		
	}
	
	
	public String getStudentNumber() {
		return StudentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		StudentNumber = studentNumber;
	}
}
