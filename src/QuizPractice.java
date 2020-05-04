import java.util.Scanner;

public class QuizPractice implements Logger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String original, reverse = ""; // Objects of String class
	    try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter a string to check if it's a palindrome");
			original = in.nextLine();
		}
	    int length = original.length();

	    for (int i = length - 1; i >= 0; i--)
	      reverse = reverse + original.charAt(i);

	    if (original.equals(reverse))
	      System.out.println("The string is a palindrome.");
	    else
	      System.out.println("The string isn't a palindrome.");
	  }
	
		
		
	

	@Override
	public void Log(String Log) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Error(String Error) {
		// TODO Auto-generated method stub
		
	}

}
