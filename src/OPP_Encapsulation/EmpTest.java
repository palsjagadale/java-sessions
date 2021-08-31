package OPP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {

		Employee emp = new Employee(12, 12.23);
		emp.setName("Pallavi");
		emp.setSalary(95.03);
		emp.setShares(0.23);
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getShares());

	}

}
