package OPP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		
		System.out.println("trying to launch browser");
		
		isChromePresent();
		isFirefoxPresent();
		checkBrowserVersion();
		
	}

	private void isChromePresent() {
		System.out.println("isChromePresent");
	}

	private void isFirefoxPresent() {
		System.out.println("isFirefoxPresent");
	}

	private void checkBrowserVersion() {
		System.out.println("CheckRamSpace");
	}

}
