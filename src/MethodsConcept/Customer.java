package MethodsConcept;

public class Customer {

	String name;
	int age;
	static String url = "http://www.amazon.com";

	public static void shareInfo() {
		System.out.println("share info...");
	}

	public void sendMail() {
		System.out.println("send mail...");
	}

	public static void main(String[] args) {

		// 1. non static stuff(vars + methods):
		// create the object:
		Customer obj = new Customer();
		obj.name = "Rita";
		obj.age = 20;

		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.url);
		obj.shareInfo();
		obj.sendMail();

		// 2. call static stuff (vars + methods):
		// a. call by class name:
		System.out.println(Customer.url);
		Customer.shareInfo();

		// b. call them directly:
		System.out.println(url);
		shareInfo();
	}

}
