
public class Application {

	public static void main(String[] args) {
		
		
		LoggerLesson logger = new FileLogger();
		
		logger.info("Hello");	
		logger.warning("This is a Warning!");
		logger.error("Opps, This is an Error!");
		logger.fatal("Fatal Error"); 
		
		logger.close();
	}
}
