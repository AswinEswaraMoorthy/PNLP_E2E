package com.pageobject;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.utils.Baseclass;
import com.utils.ExcelReader;

public class LoginPage extends Baseclass {

	Baseclass bs = new Baseclass();

	public static ExcelReader Excel = new ExcelReader();
	Object[][] objectArray;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='outlined-basic1']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='outlined-basic2']")
	private WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement loginbtn;

	public void enterUsername() throws IOException {
		objectArray = Excel.getTestData();
		String Uname = (String) objectArray[0][0];
		username.sendKeys(Uname);
	}

	public void enterPassword() throws IOException {
		objectArray = Excel.getTestData();
		String Pwd = (String) objectArray[0][1];
		password.sendKeys(Pwd);
	}

	public void clickLoginButton() {
		loginbtn.click();
	}

	@FindBy(xpath = "//input[@type='search']")
	private WebElement search;

	public void validation() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='search']")));
		Text(search, "test");

	}

	public void isLoggedIn() throws InterruptedException {
		explicitwait();
		String Actual = constantValues.default_Url;
		String CurrentUrl = driver.getCurrentUrl();
		Assert.assertEquals(Actual, CurrentUrl);

	}

}
