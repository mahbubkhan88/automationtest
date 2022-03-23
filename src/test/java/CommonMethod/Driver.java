package CommonMethod;

import org.openqa.selenium.WebDriver;

public class Driver {
	
	//This is Chrome Driver Location and WebDriver
	public static final String DRIVER_LOCATION="C:\\chromedriver.exe";
	public static final String DRIVER_NAME="webdriver.chrome.driver";
	
	//This is a setter method
	private static WebDriver driver;
	public static void setDriver (WebDriver webDriver) {
		if(driver == null ) {
			driver = webDriver;
		}
	}
	
	//This is a getter method
	public static WebDriver getDriver() {
		if(driver == null) {
			throw new AssertionError("Driver is null. Initialize driver before calling this method");
		}
		return driver;
	}
	
}
