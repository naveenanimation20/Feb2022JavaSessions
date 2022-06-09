package Super_Keyword;

public class Company {
	
	int salary = 100;
	
	public void holiday() {
		System.out.println("comp holiday...");
	}

	public Company() {
		super();
		System.out.println("def...comp...const...");
	}

	public Company(int a) {
		System.out.println("comp..." + a);
	}

	public Company(int a, int b) {
		System.out.println("comp..." + a + b);
	}

}
