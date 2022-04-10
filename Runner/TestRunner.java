package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Eclipse\\Cucumber\\Cucumber_Framework\\src\\test\\resources\\Features",
		glue = "StepDefenition",
		dryRun = false,
		monochrome = true,
		plugin = {"html:target/cucumber-reports/reports.html"}
	
		
				
		
		)

		

public class TestRunner {

}
