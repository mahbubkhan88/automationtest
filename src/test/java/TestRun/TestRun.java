package TestRun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "StepDef" }, monochrome = true, plugin = {
		"pretty", "html:target/report/report.html"})
public class TestRun {

}
