package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Regression", features = { "src/test/resources/features/PNLP_Login.feature" }, glue = {
		"com.stepDefinitions" }, plugin = {
				"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm" }, monochrome = false, dryRun = false)

public class CucumberTestRunner {
	
}
