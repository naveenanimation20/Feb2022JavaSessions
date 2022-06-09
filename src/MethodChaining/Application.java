package MethodChaining;

public class Application {

	public void m1() {
		System.out.println("m1 method");
		m2();
		t1();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method....");
	}
	
	public static void t1() {
		System.out.println("t1 method...");
		t2();
		Application a1 = new Application();
		a1.m3();
		
	}
	
	public static void t2() {
		System.out.println("t2 method...");
		t3();
	}
	
	public static void t3() {
		System.out.println("t3 method...");
	}

	public static void main(String[] args) {
		
		Application app = new Application();
		app.m1();
		

	}

}
