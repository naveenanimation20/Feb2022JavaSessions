package FinalizeConcept;

public class Employee {
	
	//final -- keyword
	//finally -- block
	//finalize: method
	int age = 20;
	
	@Override
	public void finalize() {
		System.out.println("employee -- finalize method");
	}
	

	public static void main(String[] args) {

		Employee e = new Employee();
		e = null;
//		System.out.println(e.age);
		
		Student s = new Student();
		s = null;
		//
		
		System.gc();
		System.out.println(s.name);

		
		
		
	}

}
