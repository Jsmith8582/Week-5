
public class Exceptions {

	public static void main(String[] args) {
		
		 /*
		  * Checked Exception - Explicitly check for in code
		  *   Something we can handle when they occur
		  *   
		  *   try catch block - Handles Checked exceptions
		  * 
		  * Unchecked Exception - Is something that we have control over
		  *   generally caused by a mistake on the end of the coder
		  *   either an out of bounds exception, etc
		  * 
		  */
		
		int[] numbers = new int[3];
		System.out.println("Hi");
		
		if (numbers.length > 3) {
		System.out.println(numbers[3]);
		}
		
		System.out.println("Bye!");
				
		//try {
		//	System.out.println(numbers[3]);
		//} catch (Exception e) {
		//	System.out.println(e.toString());
		//}
		//System.out.println("test");
		
	}
}
