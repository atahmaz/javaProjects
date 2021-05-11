package homework3;

public class Instructor extends User {
	private String instructorNumber = "INS" + this.getId();

	public Instructor() {
		super();
		
	}

	public Instructor(int id, String firstName, String lastName, int age, String mail) {
		super(id, firstName, lastName, age, mail);
		
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

}
