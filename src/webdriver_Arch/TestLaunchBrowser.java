package webdriver_Arch;

public class TestLaunchBrowser {

	public static void main(String[] args) {
		// LaunchChrome lc = new LaunchChrome();

//		lc.get("http://www.yahoo.com");
//		lc.sendKeys("http://www.google.com");
//		
//		lc.click();
//		lc.findelement();
//		lc.findelements();
//		lc.getUrl();
//		lc.getTitle();

		Webdriver driver = new LaunchChrome();

		// String browser = "chrome";
		driver.get("http://www.google.com");
		String title = driver.getTitle();

		System.out.println(title);
		driver.sendKeys("admin@gmail.com");
		driver.quit();

	}

}
