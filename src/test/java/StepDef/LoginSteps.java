package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Dashboard;
import pages.Home;

public class LoginSteps {
	
	WebDriver driver=Hook.driver;
	
	Home home = new Home();
	Dashboard dashboard = new Dashboard();
	
	@Given("Browse the website")
	public void browse_the_website() {
		driver.navigate().to("http://automationpractice.com/index.php");
	}

	@And("Click on Sign in button")
	public void click_on_sign_in_button() {
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]")).click();
	}
	
	@When("^User has provided valid credentials$")
	public void user_has_provided_valid_credentials() throws Throwable {
		//driver.findElement(By.name("email")).sendKeys("mahbubkhan88@gmail.com");
		//driver.findElement(By.name("passwd")).sendKeys("123456");
		//driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button")).click();
		home.login("mahbubkhan88@gmail.com", "123456");
	}

	@Then("User should be able to login")
	public void user_should_be_able_to_login() {
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dashboard.checkLogin();
	}
	
}