package MethodsConcept;

public class Application {
	
	//data members: class vars + function
	
	//can not create a function inside a function
	//function can not be duplicate
	//to call a function, we have to create the object of the class
	
	//1. no input and no return:
	//void : does not return anything
	public void test() { //0 param
		System.out.println("test method...");
	}
	
	public void addition() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	//2. no input and some return:
	public String getName() {
		System.out.println("get name method...");
		String name = "Tom";
		return name;
	}
	
	public int getSum() {
		System.out.println("get sum method...");
		int a = 10;
		int b = 20;
		int sum = a+b;
		return sum;
	}
	
	//3. some input and some return:
	public int add(int x, int y) { //2 params
		System.out.println("add method");
		int z = x+y;
		return z;
	}
	
	
	//WAF : input --> StudentName (String)
	//return: marks of the student (int)
	
	public int getMarks(String studentName) {
		System.out.println("getting marks for student : " + studentName);
		if(studentName.equals("Monika")) {
			return 90;
		}
		else if(studentName.equals("Ravi")) {
			return 95;
		}
		else if(studentName.equals("Deepa")) {
			return 100;
		}
		
		else {
			System.out.println("student is not found..."+ studentName);
			return -1;
		}
		
	}
	
	public int getStMarks(String studentName) {
		System.out.println("getting marks for student : " + studentName);
		int marks = -1;
		
		if(studentName.equals("Monika")) {
			marks = 90;
		}
		else if(studentName.equals("Ravi")) {
			marks = 95;
		}
		else if(studentName.equals("Deepa")) {
			marks = 100;
		}
		else if(studentName.equals("Sri")) {
			marks = 0;
		}
		
		else {
			System.out.println("student is not found..."+ studentName);
		}
		return marks;

	}
	

	public static void main(String[] args) {
		Application app = new Application();
		app.test();//calling a function
		app.addition();
		
		String n = app.getName();
		System.out.println("my trainer name is : " + n);
		
		System.out.println(app.getName());
		
		int s1 = app.getSum();
		System.out.println(s1+5-1);
		
		int d1 = app.add(10, 20);//arguments
		System.out.println(d1);
		
		int num = app.getMarks("Monika");
		System.out.println(num);

		int num1 = app.getMarks("Tom");
		System.out.println(num1);
		//validation 
		if(num1 == -1) {
			System.out.println("dont print the marsksheet");
		}
		
		int m1 = app.getStMarks("Ravi");//95
		System.out.println(m1);
		
		m1 = app.getStMarks("Naveen");//-1
		System.out.println(m1);
				
	}
	
	
	

}
