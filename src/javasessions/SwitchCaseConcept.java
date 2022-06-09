package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String name = "Harsh";
		switch (name) {
		case "Harsh":
			System.out.println("100 marks");
			break;

		case "Ravi":
			System.out.println("90 marks");
			break;

		case "Naveen":
			System.out.println("10 marks");
			break;

		case "Vicky":
			System.out.println("80 marks");
			break;

		default:
			System.out.println("student is not found: " + name);
			break;
		}

		//
		int marks = 91;
		// boolean flag = true;
		switch (marks) {
		case 90:
			System.out.println("Science");
			break;

		case 80:
			System.out.println("Comm");
			break;

		case 70:
			System.out.println("Arts");
			break;

		default:
			System.out.println("FAILED....");
			break;
		}

		//
		String browser = "CHROME";
		
		switch (browser.toLowerCase().replace(" ", "")) {
		
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch ff");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("please pass the right browser...."+ browser);
			break;
		}
		
		
		//
		//test env
		//DEV, QA, UAT, STAGE, PQA, PROD
		//switch case
		//if elesif
		
		//
		//state (Key)
		//Cases: KA, MH, Delhi, 
		//total corona cases
		
		String emp = "Ravi";
		int salary = 0;
		switch (emp) {
		case "Naveen":
			salary = 20;
			break;
		case "Sharath":
			salary = 80;
			break;
		case "Monika":
			salary = 90;
			break;

		default:
			System.out.println("emp is not found....");
			break;
		}
		
		System.out.println("emp : " + emp + " having salary : " + salary);

	}

}
