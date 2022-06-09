package ConstructorConcept;

public class Student {

	private Student() {
		System.out.println("private student const....");
	}

	public Student(int a) {
		this();
	}

	public static void main(String[] args) {

		Student st = new Student();

	}

}
