package MethodsConcept;

public class Person {

	int x;
	int y;

	public int sum(int a, int b) {
		int z = a + b;
		return z;
	}

	public void sum() {
		System.out.println("bye...." + 100);
	}

	public void getInfo(Person p) {

		System.out.println(p.x);
		System.out.println(p.y);

		p.x = 30;
		p.y = 40;

	}

	public static void main(String[] args) {

		Person obj = new Person();
		obj.sum(10, 20);// call by value: method overloading : compile time poly+morphism

		obj.x = 10;
		obj.y = 20;

		obj.getInfo(obj);// call by reference
		System.out.println(obj.x);
		System.out.println(obj.y);

	}

}
