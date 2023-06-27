package mockInterview;

public class Q14_Employee {
	private String name;
	private String jobTitle;
	private int salary;

	public Q14_Employee(String name, String jobTitle, int salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getjobTitle() {
		return jobTitle;
	}

	public int getSalary() {
		return salary;
	}

	public void setName() {
		this.name = name;
	}

	public void setJobTitle() {
		this.jobTitle = jobTitle;
	}

	public void setSalary() {
		this.salary = salary;
	}

	public void raiseSalary(int percentage) {
		salary = salary + salary * percentage / 100;
	}

	public void printEmpDetails() {
		System.out.println("Name: " + name);
		System.out.println("JobTitle: " + jobTitle);
		System.out.println("Salary: " + salary);
	}

	public static void main(String[] args) {
//		Write a Java program to create a class called "Employee" with a name, job title, 
//		and salary attributes, and methods to calculate and update salary.

		Q14_Employee emp = new Q14_Employee("Poorna", "QA", 100);
		Q14_Employee emp1 = new Q14_Employee("chandra", "QA", 400);
		System.out.println("\n EMPLOYEE DETAILS");
		emp.printEmpDetails();
		emp1.printEmpDetails();
		System.out.println("After raising salary");
		emp.raiseSalary(3);
		emp1.raiseSalary(3);
		emp.printEmpDetails();

		emp1.printEmpDetails();
	}

}
