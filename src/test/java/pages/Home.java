package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepdef.Hook;

public class Home {
	
	WebDriver driver = Hook.driver;
	
	By email = By.name("email");
	By password = By.name("passwd");
	By signinButton = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button");
	
	public void login(String user, String pass) {
		driver.findElement(email).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(signinButton).click();
	}
	
}
