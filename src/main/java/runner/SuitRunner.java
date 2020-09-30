package runner;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features =".\\src\\main\\resources\\Feature",glue= {"stepdefination"})
public class SuitRunner {
	



}

