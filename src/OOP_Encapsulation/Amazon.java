package OOP_Encapsulation;

public class Amazon {

	private String username;
	private String password;

	public Amazon(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void doLogin() {
		System.out.println("logged in with: " + username + ":" + password);
	}

	public void logout() {
		System.out.println("logout from app.....");
	}

	public String getUsername() {
		return username;
	}

	private void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
