package webdriver_Arch;

public interface Webdriver extends SearchContext {
	
	public void click();
	
	public void sendKeys(String value);

	public void findelement();
	
	public void quit();
	
	public void get(String url);
	
	public String  getUrl();
	
	public String getTitle();
	
	

}
