package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "", features = {"src/test/resources/features/PNLP_EndtoEnd.feature" }, glue = {
		"com.stepDefinitions" }, plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}, monochrome = false)

public class cucumberTestRunner {

}

