package FinalizeConcept;

public class Student extends Employee{
	
	public String name = "tom";
	
	@Override
	public void finalize() {
		System.out.println("student -- finalize method");
	}

}
