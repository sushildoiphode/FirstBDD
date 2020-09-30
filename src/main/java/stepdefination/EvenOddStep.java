package stepdefination;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EvenOddStep {
	int x,y,result;
	@Given("User has {int} and {int}")
	public void acceptNumbers(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@When("User add two numbers")
	public void addNumbers() {
		result=x+y;
	}
	@Then("Addition result must be even")
	public void checkIfAdditionIsEven() {
		System.out.println("Addition of Both number: "+result);
		int rem= result%2;
		Assert.assertEquals(0, rem);
	}

}
