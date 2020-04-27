
public class InheritcaneAbstractionPolymorphism {

	
	public static void main(String[] args) {
		
		//list<String> list = new ArrayList<String>
		Employee salary = new SalariedEmployee("Tom", "Johnson", 20.50);
		Employee hourly = new HourlyEmployee("Joe", "Turner", 10.50, 65.5);
		Employee manager = new Manager("Josh", "Smith", 28.75, 1.5);
		
		System.out.println(salary.calculatePay());
		System.out.println(hourly.calculatePay());
		System.out.println(manager.calculatePay());
		
		//Calculating out roughly 3 employee types pay per 2 week schedule
	}
}
