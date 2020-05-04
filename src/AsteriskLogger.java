
public class AsteriskLogger implements Logger {

	
	@Override
	public void Log(String str) {
		System.out.println("***" + str + "***");
		
	}

	@Override
	public void Error(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 13 + str.length(); i++) {
			sb.append("*");
		}
		System.out.println(sb.toString() + "\n" + "***Error: " + str.toString() + "***" + "\n" + sb.toString());
	}
}
