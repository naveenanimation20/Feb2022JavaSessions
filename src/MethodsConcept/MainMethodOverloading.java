package MethodsConcept;

public class MainMethodOverloading {

	// PSVM-s[]
	public static void main(String a[]) {
		System.out.println("hi");
		MainMethodOverloading.main(10, 20);
	}

	public static void main(String t) {
		System.out.println(t);
	}

	public static void main(int a, int b) {
		System.out.println(a + b);
	}

}
