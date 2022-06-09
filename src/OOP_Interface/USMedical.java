package OOP_Interface;

public interface USMedical extends WHO, UNHG {

	int min_fee = 10;
	// interface vars are static and final in nature by default

	// can not have a method body: an abstract method
	// only method declaration is allowed
	// only method protoype
	// no buss logic
	// can not create the object of Interface
	// abstract method can not be static

	public void physioServices();

	public void cardioServices();

	public void pediaServices();

	public void emergencyServices();

	@Override
	public void covidGuidelines();

	// after jdk 1.8: two major changes:
	// 1. can have static method with method body:

	public static void billing() {
		System.out.println("US medical -- billing....");
	}

	// 2. can have a default method in interface
	default void medNews() {
		System.out.println("US -- med news");
	}

}
