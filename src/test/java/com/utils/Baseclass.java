package com.utils;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Baseclass {

	public static WebDriver driver;
	public static ConstantValues constantValues;
	public static Wait<WebDriver> wait;

	public static long timeduration = 2000L;
	public static int explicit_timeduration = 5000;

	Random random = new Random();
	int randomNumber = new Random().nextInt(1000);
	protected String randomNumberString = String.valueOf(randomNumber);

	private String generateScreenshotPath() {
		String randomNumberString = String.valueOf(new Random().nextInt(100));
		return "C:\\Users\\aswin.moorthy\\Automation\\PNLP_BDD\\screenshot\\" + "PNLP_" + randomNumberString + ".png";
	}

	public void takeScreenshot() {
		String screenshotpath = generateScreenshotPath();
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File(screenshotpath));
			System.out.println("Screenshot saved: " + screenshotpath);
		} catch (IOException e) {
			System.err.println("Failed to save screenshot: " + e.getMessage());
		}
	}

	public static void implictwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeduration));

	}

	public static void explicitwait() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(explicit_timeduration));

	}

	public static WebElement waitForElementToBeClickable(WebDriver driver, WebElement element, Duration timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	// sendkeys
	public WebElement passText(WebElement search, String text) {
		search.sendKeys(text);
		return search;
	}

	// clear
	public WebElement clearText(WebElement clear) {
		clear.clear();
		return clear;
	}

	// toaster
	public static void validateToasterMessage(WebElement toasterElement, String expectedMessage) {
		wait.until(ExpectedConditions.visibilityOf(toasterElement));
		String actualMessage = toasterElement.getText();
		assert actualMessage.equals(expectedMessage) : "Toaster message doesn't match expected";
	}
}
