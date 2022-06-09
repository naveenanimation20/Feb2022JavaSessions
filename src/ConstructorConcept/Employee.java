package ConstructorConcept;

public class Employee {
	// class vars:
	String name;
	int age;
	String id;
	boolean isActive;
	double salary;

//	public Employee() {// 0 param
//		System.out.println("0 param const...default...");
//	}

//	public Employee(int a) {//1 param
//		System.out.println("1 param const..." + a);
//	}
//	
//	public Employee(int a, String b) {//1 param
//		System.out.println("2 params const..." + a+b);
//	}

	//const... vs function:
	//1. const name will be same as the class name but function can have any name
	//2. const will be called when u create the object but function will be called using obj ref variable
	//3. const will help to create the object with class variable, it should not have any buss logic
	//but function u should write buss logic
	//4. const.. can not have any return, no void but func...may or may not return
	
	
	
	public Employee(String name) {
		this.name = name;
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Employee(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public Employee(String name, int age, String id, boolean isActive, double salary) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.isActive = isActive;
		this.salary = salary;
	}

	public static void main(String a[]) {

		Employee e = new Employee("Tom");
		System.out.println(e.name + " " + e.age);

		Employee e1 = new Employee("Peter", 30);
		System.out.println(e1.name + " " + e1.age);
		
		Employee e2 = new Employee("Lisa", 25, "101");
		
		//Employee e3 = new Employee();
		
		
		Company c1 = new Company("IBM", "Pune");
		Company c2 = new Company("TCS", "Bangalore", 1000, true, 30.99);


	}

}
