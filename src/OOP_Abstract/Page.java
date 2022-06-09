package OOP_Abstract;

public abstract class Page {
	
	int time = 10;
	static int age = 20;

	// 0 to 100% abstraction
	// 100% abstraction -- only abstract methods
	// partial abstraction
	// 0% abstraction
	//abstract class object can not be created
	//but const... can be created
	//it will be called when you create the object of child class

	public Page() {
		System.out.println("Page const....");
	}
	
	public Page(int a) {
		System.out.println("Page const...."+ a);
	}
	
	public abstract void title();

	public abstract void url();

	public abstract void header();

	public void timeOut() {
		System.out.println("Page - timeout 20 secs");
	}
	
	public final void logo() {
		System.out.println("Page logo");
	}
	

}
