package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/LeaftapsLogin.Feature",
		glue="testdefinitions",
		tags={"~@sit","@sanity"}
		/*tags= {"~@sit,@sanity"}*/,
		plugin= {"pretty", "junit:target/cucumber-reports/Cucumber.xml"})

public class RunTest extends AbstractTestNGCucumberTests{
	
}
