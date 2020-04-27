
public class HourlyEmployee extends Employee {

	public HourlyEmployee(String firstName, String lastName, double pay, double hoursWorked) {
		super(firstName, lastName, pay);
		this.hoursWorked = hoursWorked;
	}


	private double hoursWorked;
	
	
	@Override
	public double calculatePay() {
		return getPay() * hoursWorked;
	}

	
	
	
	
}
