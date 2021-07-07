package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Java Eclipse\\AdactinCucumber\\src\\test\\resources\\AdactinFeaturefiles", 
glue = { "org.loginsteps"},
tags= {"@Hooks"},
dryRun =false,
plugin= {"pretty","html:report/WebReport","json:\\src\\test\\resources\\report\\jsonreport.json"})
public class TestRunner extends JvmReport {
		@AfterClass
	public static void generateJvm() {
		JvmReport.generatejvm("D:\\Java Eclipse\\AdactinCucumber\\report\\jsonreport.json");

	}
}
	
