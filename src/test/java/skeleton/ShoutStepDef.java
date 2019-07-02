package skeleton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ShoutStepDef {
	String Expected="Free Coffee";
	String actual;
	Person Lucy=new Person();
	Person Sean=new Person();

	@Given("^Lucy is (\\d+) meters away from Sean$")
	public void lucy_is_meters_away_from_Sean(int distance) throws Throwable {
	  Sean.setDisctance(0);  
	  Lucy.setDisctance(distance);
	   
	}

	@When("^Sean shouts \"(.*?)\"$")
	public void sean_shouts(String message) throws Throwable {
	   actual=message;
	   
	}

	@Then("^Lucy hears Sean's message$")
	public void lucy_hears_Sean_s_message() throws Throwable {
	    Assert.assertEquals(Expected, actual);

	}
}
