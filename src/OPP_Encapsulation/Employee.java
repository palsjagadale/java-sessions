package OPP_Encapsulation;

public class Employee {

	public String name;

	private double salary;
	private double shares;
	
	public Employee(double shares, double salary) {
			this.shares = shares;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getShares() {
		return shares;
	}

	public void setShares(double shares) {
		this.shares = shares;
	}

	

	

	
}
