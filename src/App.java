
public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.Log("Hey");
		logger.Error("Hello there");
		
		
		
		Logger logger2 = new SpacedLogger();
		logger2.Log("Hey");
		logger2.Error("Hey Mr!");
		
	}
}
