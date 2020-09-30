package stepdefination;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculator {
	int x,y,r;
	@Given("Take two numbers from user")
	public void acceptTwoNumbers() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Calculator");
		System.out.println("Enter First Number: ");
		x=sc.nextInt();
		System.out.println("Enter Second Number: ");
		y=sc.nextInt();
	}
	@When("We add two numbers")
	public void addNumbers() {
		r=x+y;
	}
	@Then("Addition result should be displayed")
	public void displayedResult() {
		System.out.println("Addtion of Two Number: "+r);
	}

}
