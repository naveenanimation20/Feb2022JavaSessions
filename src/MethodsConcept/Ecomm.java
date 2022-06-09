package MethodsConcept;

public class Ecomm {

	// method overloading: compile (static) time poly+morphism
	// when you have different methods in the same class:
	// 1. with the same name
	// 2. different number of parameters
	// 3. the sequence of the parameters
	public int test() {// 0
		System.out.println("hi");
		return 100;
	}

	public void test(int a) {// 1
		System.out.println("hello " + a);
	}

	public void test(String a) {// 1
		System.out.println("hello " + a);
	}

	public void test(double a) {// 1
		System.out.println("hello " + a);
	}

	public void test(int a, int b) {// 2
		System.out.println("hello " + a);
	}

	public void test(int a, String b) {// 2
		System.out.println("hello " + a);
	}

	public void test(String a, int b) {// 2
		System.out.println("hello " + a + b);
	}

	//
	public void login() {

	}

	public void login(String un, String pwd) {

	}

	public void login(String un, String pwd, String role) {

	}

	public void login(String un, String pwd, String email, int otp) {

	}

	//
	public void doSearch() {

	}

	public void doSearch(String productName) {

	}

	public void doSearch(String productName, int price) {

	}

	public void doSearch(String productName, int price, String color) {

	}

	public void doSearch(String productName, String seller) {

	}

	//
	public void doPayment(String cc, int cvv) {

	}

	public void doPayment(String cc, int cvv, int otp) {

	}

	public void doPayment(String UPI) {

	}

	public void doPayment(String UPI, int otp, long ph) {

	}

	// Uber:
	public void booking(String start, String end) {

	}

	public void booking(String start, String end, String carType) {

	}

	public void booking(String start, String end, String carType, int pssngers) {

	}

	public static void main(String[] args) {

		Ecomm ob = new Ecomm();
		int s = ob.test();
		System.out.println(s);

		ob.test("selenium", 100);

		ob.booking("Bangalore", "Mysore", "SUV");

	}

}
