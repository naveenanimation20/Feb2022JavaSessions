package BuilderPattern;

public class Ecomm {

	public Ecomm login() {
		System.out.println("default login...");
		return this;
	}

	public Ecomm login(String un, String pwd) {
		System.out.println("login..with ...." + un + ":" + pwd);
		return this;
	}

	public Ecomm doSearch(String name) {
		System.out.println("searching...." + name);
		return this;

	}

	public Ecomm doSearch(String name, int price) {
		System.out.println("searching...." + name + ":" + price);
		return this;

	}

	public Ecomm addToCart(String name) {
		System.out.println("add to cart..." + name);
		return this;
	}

	public Ecomm doPayment(String upi) {
		System.out.println("pay by " + upi);
		return this;
	}

	public Ecomm doPayment(String CC, int otp) {
		System.out.println("pay by " + CC + ":" + otp);
		return this;
	}

	public Ecomm getOrderId() {
		System.out.println("order id is : " + 12345);
		return this;
	}

	public Ecomm logout() {
		System.out.println("logout.....");
		return this;

	}

}
