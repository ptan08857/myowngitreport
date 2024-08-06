package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"features\\Login.feature"},
glue = {"step.definition"},
plugin = {"html:htmlreport/cucumber-test-report.html","pretty","json:target/cucumber-report.json"},
tags = "@regression"
		)
public class LoginTestRunner extends AbstractTestNGCucumberTests{

}
