package javasessions;

//blueprint/template/category of the Objects

public class Employee {
	
	String name;
	int age;
	String city;
	double salary;
	boolean isActive;
	

	public static void main(String[] args) {

		
		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age = 20;
		e1.city = "LA";
		e1.salary = 12.33;
		
		System.out.println(e1.name + " "+ e1.age + " " + e1.city + " " + e1.salary);
		
		Employee e2 = new Employee();
		e2.name = "Deepa";
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.city);
		System.out.println(e2.salary);
		
		Employee e3 = new Employee();
		System.out.println(e3.isActive);
		
		Employee e4 = new Employee();
		e4 = null;//null reference object
//		e4.name = "Lisa";//NPE
//		System.out.println(e4.name);
		
		new Employee().name = "Peter"; //no reference object
		new Employee().age = 30;


		
		
	}

}
