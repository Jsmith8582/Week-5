
public class Student {
	//all of classes have contained main method. which is the entry point. 
	//projects normally only have 1 main method per package.
	
	static int numberOfStudents;
	
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int gradeLevel;
	
	public Student() {}
	
	//Next 3 methods are the Constructors
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel; 		
	}
	
	public void introduce() {
		System.out.println("Hello, my Name is " + firstName + " " + lastName + ".");
		System.out.println("I am in grade " + gradeLevel + ".");
		System.out.println("My Phone Number is " + phoneNumber + ".");
	}
	
	/*
	 * Private Method for the next 8 methods
	 */
	
	private boolean checkLength(String str, int length) {
		return str.length() > length;
	}
	
	//Next 8 methods are getters and setters
	
	public void setFirstName(String firstName) {
		if (checkLength(firstName, 1)) {
			this.firstName = firstName;		
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		if (checkLength(lastName, 1)) {
			this.lastName = lastName;
		}
	}
	
	public String lastName() {
		return lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if (checkLength(phoneNumber, 9)) {
			this.phoneNumber = phoneNumber;
		}		
	}
	
	public String phoneNumber() {
		return phoneNumber;
	}
	
	public void setGradeLevel(int gradeLevel) {
		if (gradeLevel > 0 && gradeLevel < 13) {
			this.gradeLevel = gradeLevel;
		}
	}
	
	public int gradeLevel() {
		return gradeLevel;
	}
	
	
	
	
}
