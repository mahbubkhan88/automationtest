package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepdef.Hook;

public class Dashboard {

	WebDriver driver = Hook.driver;
	
	By logedinInfo = By.cssSelector(".info-account");
	
	public void checkLogin() {
		String exp_message = "Welcome to your account. Here you can manage all of your personal information and orders.";
		String accual = driver.findElement(logedinInfo).getText();
		Assert.assertEquals(exp_message, accual);
	}
	
}
