package webdriver_Arch;

public class LaunchChrome implements Webdriver {
	
	public LaunchChrome()
	{
		System.out.println("launch chrome");
	}

	@Override
	public void findelements() {
		System.out.println("findelements");

	}

	@Override
	public void click() {
		
		System.out.println("click");

	}

	@Override
	public void sendKeys(String value) {
		System.out.println(value);

	}

	@Override
	public void findelement() {
		System.out.println("findelement");

	}

	@Override
	public void quit() {
		System.out.println("quit");

	}

	@Override
	public void get(String url) {
		System.out.println(url);

	}

	@Override
	public String getUrl() {

		return "http://www.google.com";
	}

	@Override
	public String getTitle() {
		return "xyz application";

	}

}
