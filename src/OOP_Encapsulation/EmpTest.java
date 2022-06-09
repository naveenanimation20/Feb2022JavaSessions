package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {

//		Employee e1 = new Employee();
//		e1.setName("tom");
//		System.out.println(e1.getName());
//		
//		e1.setAge(30);
//		System.out.println(e1.getAge());
//		
//		e1.setSalary(12.33);
//		System.out.println(e1.getSalary());
		
		
		//POST
		Employee e1 = new Employee("tom", 20, 12.33);
		System.out.println(e1.getName());//GET
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		
		//UPDATE: PUT
		e1.setAge(25);
		e1.setSalary(30.32);
		
		System.out.println(e1.getName());//GET
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		
		System.out.println(e1.getEmpInfo());

		
		
		
		
	}

}
