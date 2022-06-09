package BuilderPattern;

public class AmazonShopping {

	public static void main(String[] args) {

		Ecomm e1 = new Ecomm();
				
		e1.login("naveen@amazon.com", "naveen@123")
			.doSearch("Macbook Pro")
				.addToCart("Macbook Pro")
					.doPayment("929292929@upi")
						.getOrderId()
							.logout();
		
		//
		e1.login("naveen@amazon.com", "naveen@123")
			.doSearch("Tshirt", 2000)
				.logout();
		
		//
		e1.login("naveen@amazon.com", "naveen@123")
			.doSearch("iPad", 20000)
				.addToCart("iPad")
					.logout();
		
		//
		e1.login("naveen@amazon.com", "naveen@123")
			.addToCart("iPad")
				.doPayment("12121212121", 1212)
					.getOrderId()
						.logout();
		
		//
		e1.login("naveen@amazon.com", "naveen@123")
			.logout();
	}

}
