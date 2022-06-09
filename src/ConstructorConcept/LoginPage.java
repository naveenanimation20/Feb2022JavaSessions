package ConstructorConcept;

public class LoginPage{

	String username;
	String password;

	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public LoginPage() {
		System.out.println("default const....");
	}
	
	public void doLogin() {
		System.out.println("please enter creds: " + username + ":" + password);
		System.out.println("login successfully done....");
	}
	
	

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage("admin@gmail.com", "admin123");
		lp.doLogin();
		
		LoginPage lp1 = new LoginPage();
		lp1.doLogin();
		
		Student st = new Student(10);
		//System s = new System();

	}

}
