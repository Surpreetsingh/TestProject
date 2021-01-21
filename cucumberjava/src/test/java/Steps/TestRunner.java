package Steps;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"Steps"},
monochrome=true,
plugin = {//"html:target/cucumber/report.html","junit:target/reportsJunit/cucumber.xml",
		"json:target/cucumber.json","pretty"}

		)
public class TestRunner {
	
}
