
public class SpacedLogger implements Logger {

	@Override
	public void Log(String str) {
		StringBuilder sb = new StringBuilder();		
		for (char letter : str.toCharArray()) {
			sb.append(letter).append(" ");
		}
		System.out.println(sb.toString());
	}
		
	@Override
	public void Error(String str) {
		StringBuilder sb = new StringBuilder();
		for (char letter : str.toCharArray()) {
			sb.append(letter).append(" ");
		}
		System.out.println("Error: " + sb.toString());
		
	}

}
