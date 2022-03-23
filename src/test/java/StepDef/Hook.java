package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonmethod.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

	public static WebDriver driver = null;

	@Before
	public void initDriver() {
		System.out.println("Open Browser");
		System.setProperty(Driver.DRIVER_NAME, Driver.DRIVER_LOCATION);
		Driver.setDriver(new ChromeDriver());
		driver = Driver.getDriver();
		driver.manage().window().maximize();
	}

	@After
	public void teardown() {
		System.out.println("Close Browser");
		//driver.quit();
	}

}
