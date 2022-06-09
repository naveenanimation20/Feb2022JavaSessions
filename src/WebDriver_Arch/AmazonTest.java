package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {

		// Cross browser : FF, chrome, Safari

		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// SafariDriver driver = new SafariDriver();

		String browser = "CHROME";
		WebDriver driver = null;

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} 
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} 
		else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} 
		else {
			System.out.println("plz pass the right browser name......." + browser);
		}

		driver.get("http://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getUrl();
		System.out.println(url);

		driver.findElement("email-id");
		driver.sendKeys("email-id", "naveen@gmail.com");

		driver.findElement("email-pwd");
		driver.sendKeys("email-pwd", "naveen@123");

		driver.findElement("login-btn");
		driver.click("login-btn");

		driver.quit();

	}

}
