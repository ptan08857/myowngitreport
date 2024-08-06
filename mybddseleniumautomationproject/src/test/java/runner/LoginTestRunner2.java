package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"features\\Login.feature","features\\LoginwithDataDriven.feature"},
glue = {"step.definition"},
plugin = {"html:bharathhtmlreport/myreport.html","pretty","json:target/cucumber-report.json"}
		)
public class LoginTestRunner2 extends AbstractTestNGCucumberTests{

}
