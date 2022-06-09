package OOP_Abstract;

public class LoginPage extends Page {

	public LoginPage() {
		System.out.println("Login Page const....");
	}

	public LoginPage(int a) {
		super(a);
		System.out.println("Login page...const..." + a);
	}

	@Override
	public void title() {
		System.out.println("LP --title");
	}

	@Override
	public void url() {
		System.out.println("LP --url");

	}

	@Override
	public void header() {
		System.out.println("LP --header");
	}

	public void doLogin() {
		System.out.println("login to app");
	}

	@Override
	public void timeOut() {
		System.out.println("Page - timeout 10 secs");
	}

}
