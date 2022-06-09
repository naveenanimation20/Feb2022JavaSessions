package OOP_Encapsulation;

public class User {

	public static void main(String[] args) {

		Amazon seller = new Amazon("seller@gmail.com", "seller123");

		seller.doLogin();

		seller.setPassword("seller12345678");

		seller.doLogin();
		seller.logout();

		Amazon user = new Amazon("user@gmail.com", "user123");
		user.doLogin();
		user.logout();

	}

}
