
public interface LoggerLesson {

	/*
	 * Interface does not define any method implementations
	 * Only define the method signatures
	 * 
	 * use an interface when we know what the class implementing interface will do,
	 * we create an interface when we know what we want to happen, but maybe not exactly How it will happen
	 * 
	 * Changed name to LoggerLesson from ExampleInterface
	 * Created Class ConsoleLogger for use in lesson
	 * 
	 * Created Application Class for use in lesson
	 * 
	 * Created FileLogger Class for use in lesson
	 * 
	 * Rule of thumb: Interfaces should be used first, put the methods in there,
	 * then create a class. It will help to not break code downstream later on
	 * 
	 * Interfaces that we are familiar with are MAP, SET and LIST
	 * 
	 * 
	 * 
	 */
	
	public void info(String info);
	public void warning(String warning);
	public void error(String error);
	public void fatal(String fatal);
	public void close();
	
	
}
