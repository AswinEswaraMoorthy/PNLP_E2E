package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.github.dockerjava.api.model.Driver;
import com.pageobject.LoginPage;
import com.utils.Baseclass;
import com.utils.LoadProperties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends Baseclass {

	LoginPage lp = new LoginPage(driver);

	@Given("User lauch the PharmaNLP application")
	public void user_lauch_the_pharma_nlp_application() throws Throwable {
		driver.get(LoadProperties.getProperties("App_URL"));
	}

	@When("User login with valid username and password")
	public void user_login_with_valid_username_and_password() throws IOException {
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLoginButton();
		takeScreenshot();

	}

	@Then("User successfully navigate to My Projects page")
	public void user_successfully_navigate_to_my_projects_page() throws InterruptedException {
		lp.isLoggedIn();
		lp.validation();
		takeScreenshot();

	}

}
