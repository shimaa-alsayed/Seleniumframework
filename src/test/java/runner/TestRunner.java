package runner;

import io.cucumber.testng.CucumberOptions;
import test.TestBaseClass;



@CucumberOptions(features = "src/test/java/features",
glue = {"steps"},
plugin = {"pretty","html:target/cucumber-html-report"})
public class TestRunner extends TestBaseClass {

}
