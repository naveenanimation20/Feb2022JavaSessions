package WebDriver_Arch;

public class ChromeDriver implements WebDriver {

	public ChromeDriver() {
		System.out.println("launch chrome browser.....");
	}

	@Override
	public void findElement(String element) {
		System.out.println("find element : " + element);
	}

	@Override
	public void findElements(String element) {
		System.out.println("find elements : " + element);

	}

	@Override
	public void get(String url) {
		System.out.println("enter url : " + url);
	}

	@Override
	public String getTitle() {
		return "Amazon";
	}

	@Override
	public String getUrl() {
		return "https://www.amazon.com";
	}

	@Override
	public void click(String ele) {
		System.out.println("click on element : " + ele);
	}

	@Override
	public void sendKeys(String ele, String value) {
		System.out.println("enter value in ele : " + ele + " value is : " + value);
	}

	@Override
	public void quit() {
		System.out.println("quit browser...");
	}

}
