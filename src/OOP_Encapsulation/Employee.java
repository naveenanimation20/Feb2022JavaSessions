package OOP_Encapsulation;

//POJO -- plain old java object
public class Employee {

	private String name;
	private int age;
	private double salary;

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	public String getEmpInfo() {
		return name + " " + age + " " + salary;
	}
	
	
	

	// public getter and setter methods:
	//avoid setter methods
	//but getter is mandatory
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
