package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstepdef {
	WebDriver driver;
	String expectedResult="Find a Flight: Mercury Tours:";

	@Given("^user is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\v.ramiya.surendran\\Downloads\\geckodriver.exe");
	     driver=new FirefoxDriver();
		driver.get("http://demoaut.com/");
	    
	}

	@When("^user enter correct credentials$")
	public void user_enter_correct_credentials() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("tutorial");
	    driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
	}

	@Then("^user does successful login$")
	public void user_does_successful_login() throws Throwable {
		Assert.assertEquals(expectedResult, driver.getTitle());
	   
	}
}
