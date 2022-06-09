package MethodsConcept;

public class Browser {

	// WAF: launch the browser : ch, ff, safari, opera
	// function name: launchBrowser(browserName (String))
	// return : true/false (boolean)

	public boolean launchBrowser(String browserName) {

		System.out.println("launching the browser: " + browserName);
		boolean flag = false;

		switch (browserName.toLowerCase()) {
		case "chrome":
			System.out.println("launching chrome...");
			flag = true;
			break;

		case "firefox":
			System.out.println("launching ff...");
			flag = true;
			break;

		case "safari":
			System.out.println("launching safari...");
			flag = true;
			break;

		case "opera":
			System.out.println("launching opera...");
			flag = true;
			break;

		default:
			System.out.println("please pass the right browser name...." + browserName);
			break;
		}
		
		return flag;

	}

	public static void main(String[] args) {
		Browser br = new Browser();
		boolean b = br.launchBrowser("chrome");
		System.out.println(b);
		
		
		if(b) {
			System.out.println("http://www.amazon.com");
		}
		
		
		b = br.launchBrowser("IE");
		System.out.println(b);
	}

}
