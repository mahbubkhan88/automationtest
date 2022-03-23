package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver=Hook.driver;
	
	@Given("Browse the website")
	public void browse_the_website() {
		driver.navigate().to("http://automationpractice.com/index.php");
	}

	@And("^Click on Sign in button$")
	public void click_on_sign_in_button() {
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]")).click();
	}
	
	@When("^User entry email address$")
	public void user_entry_email_address() {
		driver.findElement(By.name("email")).sendKeys("mahbubkhan88@gmail.com");
	}

	@And("^User entry password$")
	public void user_entry_password() {
		driver.findElement(By.name("passwd")).sendKeys("123456");
	}

	@Then("^Press login button$")
	public void press_login_button() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button")).click();
	}
	
}