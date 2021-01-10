package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features" ,
glue= {"StepDefinitions"},
monochrome=true, 
plugin={"pretty", "junit:target/JUNITReports/reports.xml", "json:targer/JSONReports/reports.json" , "html:target/HtmlReports"}
		)

// ,
//tags="@GoogleTest"
public class TestRunner {

}
  