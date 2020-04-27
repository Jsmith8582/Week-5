
public class EncapsulationLesson {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Josh");
		student.setLastName("Smith");
		student.setPhoneNumber("1234567890");
		student.setGradeLevel(12);
		student.introduce();
		
		RectangleLesson rec = new RectangleLesson(100.0, 16.5);
		rec.setLength(15);
		System.out.println(rec.getArea());
		
		
		/*
		 * Access Modifiers
		 *   public
		 *      Accessible everywhere
		 *   private
		 *      Only accessible within the class itself 
		 *   protected
		 *      Only accessible within the class, other classes in the same package and all subclassses 
		 *   No Modifier
		 *      Same as protected, except not accessible in a subclass in different packages
		 *      
		 * Doing some work to Student to help understand the concept
		 * 
		 *    
		 */
		
		
		
	}
}
