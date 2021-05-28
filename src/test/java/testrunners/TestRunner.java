package testrunners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/EbaySearch.feature"},
		glue = {"km.stepdefinitions"},
		//tags= "@NegativeScenarios",
		plugin = { "pretty", "html:target/cucumber-reports.html" },
				 monochrome = true
		
		
		)

public class TestRunner {

}
