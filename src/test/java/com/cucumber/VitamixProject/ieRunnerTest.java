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
		tags = {"@ie"}
		
		)



//public class ieRunnerTest{}




public class ieRunnerTest extends AbstractTestNGCucumberTests{}


