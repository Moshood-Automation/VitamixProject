package com.cucumber.VitamixProject;








import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		//format = {"pretty","html:target/html/"},
		//format = {"pretty","json:target/json/output.json"},
		format = {"pretty","json:target/json/output.json","html:target/html/"},
		features = "src/test/resource",
		tags = {"@chrome"}
		
   //THIS RUNS THE TESTS IN A SEQUENTIAL CROSS BROWSER MODE
		//tags = {"@chrome , @mozila , @ie"}
		
	//THIS IS JUST A TAGGING FORMAT 	
		//tags = {"@XXX, @AAA, @BBB"}
		)



//public class chromeRunnerTest{}

public class chromeRunnerTest extends AbstractTestNGCucumberTests{}



