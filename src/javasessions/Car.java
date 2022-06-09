package javasessions;

import java.util.ArrayList;

public class Car {

	// class var
	String name;
	int price;
	String color;
	String model;
	String licNumber;
	static int wheels = 4;

	public static void main(String a[]) {

		String name = null;// local var
		System.out.println(name);

		int i = 0;
		System.out.println(i);

		Car.wheels = 5;

		Car c1 = new Car();
		System.out.println(c1.name);// null
		c1.name = "BMW";
		c1.price = 30;
		c1.color = "Blue";
		System.out.println(c1.name);// BMW
		System.out.println(c1.licNumber);
		c1.licNumber = "123456";
		System.out.println(c1.licNumber);
		c1.price = 35;
		System.out.println(c1.price);

		Car c2 = new Car();
		c2.name = "AUDI";
		c2.price = 35;
		c2.color = "Red";

		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 40;
		c3.color = "Black";

		System.out.println(c1.name + " " + c1.price + " " + c1.color);
		System.out.println(Car.wheels);

	}

}
