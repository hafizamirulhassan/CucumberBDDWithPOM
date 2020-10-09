package com.qa.crm.runner;


import org.junit.runner.RunWith;

import com.crm.qa.base.Base;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(
	features = "src\\main\\java\\com\\qa\\crm\\features\\Login.feature", // path of feature file.
	glue={"com/qa/crm/stepdefinition"},
	monochrome=true, // Given output would be readable format in console.
	dryRun=false, // actually run the feature file steps.
	strict=true,
	plugin= {"pretty" , "html:target/cucumber", "json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/report.html"} // To generate different types of reporting
	)

public class TestRunner extends Base {

	
	
}