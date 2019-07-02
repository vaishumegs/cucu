package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef {
	@Given("^i have some cakes in my hand$")
	public void i_have_some_cakes_in_my_hand() throws Throwable {
	    System.out.println("given");
	    
	}

	@When("^i wait for sometime$")
	public void i_wait_for_sometime() throws Throwable {
	    System.out.println("when");
	}

	@Then("^my cakes disapper$")
	public void my_cakes_disapper() throws Throwable {
	 System.out.println("actualresult"); 
	}

}
