package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// cucumber.project.src.test.java.stepDefinition
@RunWith(Cucumber.class)
@CucumberOptions(
		features = 
		"C:\\Users\\RobinChaudhary\\eclipse-workspace\\RestAssured_Gherkin\\src\\test\\java\\features\\GetPostFeature.feature", 
		glue = {"stepDef"},	
		format = {"pretty","html:test-output", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},   
		monochrome = true, 
		strict = true,  
		dryRun = false   
		)

public class TestRunner {

}
