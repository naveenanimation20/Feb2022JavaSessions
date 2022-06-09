package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching chrome....");
		checkRAM();
		checkOSVersion();
		chromeServices();
		System.out.println("chrome is launched....");
	}

	private void checkRAM() {
		System.out.println("check RAM");
	}

	private void checkOSVersion() {
		System.out.println("check OS");
	}

	private void chromeServices() {
		System.out.println("check update chrome services....");
	}

}
