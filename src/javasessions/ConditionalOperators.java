package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println(a > b);

		if (a > b) {
			System.out.println("a is gr than b");
		} else {
			System.out.println("b is gr than a");
		}

		if (true) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}

		boolean flag = true;
		if (flag) {
			System.out.println("JAVA");
		} else {
			System.out.println("Python");
		}

		//
		// nested if
		int marks = 97;
		if (marks <= 100) {
			if (marks >= 95) {
				System.out.println("A++ Grade");
			} 
			else {
				if (marks <= 30) {
					System.out.println("FAIL");
				} else {
					System.out.println("A Grade");
				}

			}
		} 
		else {
			System.out.println("Wrong marks");
		}

		//
		int p = 10;
		int q = 10;
		if(p==q) {
			System.out.println("hello");
		}
		
		//if -  if - if
		String name = "Harsh";
		if(name.equals("Harsh")) {
			System.out.println("100 marks");
		}
		if(name.equals("Vikay")) {
			System.out.println("90 marks");
		}
		if(name.equals("Ravi")) {
			System.out.println("80 marks");
		}
		if(name.equals("Naveen")) {
			System.out.println("10 marks");
		}
		else {
			System.out.println(name +" student is not found....");
		}
		
		//if - else if
//		String name = "Naveen";
//		if(name.equals("Harsh")) {
//			System.out.println("100 marks");
//		}
//		else if(name.equals("Vikay")) {
//			System.out.println("90 marks");
//		}
//		else if(name.equals("Ravi")) {
//			System.out.println("80 marks");
//		}
//		else if(name.equals("Naveen")) {
//			System.out.println("10 marks");
//		}
//		else {
//			System.out.println(name + " student is not found....");
//		}
		
		
		
		
		
		
		
		
		
		

	}

}
