
public class ClassesLesson {

	public static void main(String[] args) {

		
		//Now we will look at how to build our own class
		//made a new lesson called students with info to use in this class
		//used info in the Students class to fill in first name, last name, phone number and grade level
		
		
		Student student1 = new Student();
		student1.firstName = "Josh";
		student1.lastName = "Smith";
		student1.phoneNumber = "435-619-4176";
		student1.gradeLevel = 12;
		
		student1.introduce();
		
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
		Student student3 = new Student("Tommy", "Pickles", "903-442-4444", 12);
		student3.introduce();
		Student student4 = new Student("435-444-4444", "Johnny", "Roxx", 10);
		student4.introduce();
		
		
		
	}

}
