package hw08Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpName("Muhmmad Ifzal");
		emp.setEmpAGe(42);
		emp.setEmpSex('M');
		emp.setUsCitizen(true);

		System.out.println("Employee Name: " + emp.getEmpName() + "\nEmployee Age: " + emp.getEmpAGe()
				+ "\nEmployee Sex: " + emp.getEmpSex() + "\nEmployee US Citizen? " + emp.isUsCitizen());
	}

}
