package com.utils;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class Baseclass {

	public static WebDriver driver;
	public static constantValues constantValues;
	public static Wait<WebDriver> wait;

	static long timeduration = constantValues.implict_timeduration;
	static int explicit_timeduration = constantValues.explicit_timeduration;

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
		driver.manage().timeouts().implicitlyWait(timeduration, TimeUnit.SECONDS);

	}

	public static void explicitwait() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(explicit_timeduration));

	}

	public void toaster() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Project added successfully']")));
		String expectedMessage = "Project added successfully";
		WebElement toasterMessage = driver.findElement(By.xpath("//p[text()='Project added successfully']"));
		String actualMessage = toasterMessage.getText();
		assert actualMessage.equals(expectedMessage);

	}

	public static void validateToasterMessage(WebDriver driver, WebElement toasterElement, String expectedMessage) {
		wait.until(ExpectedConditions.visibilityOf(toasterElement));
		String actualMessage = toasterElement.getText();
		assert actualMessage.equals(expectedMessage) : "Toaster message doesn't match expected";
	}

	public static WebElement waitForElementToBeClickable(WebDriver driver, WebElement element, Duration timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	// sendkeys
	public void Text(WebElement search, String text) {
		search.sendKeys(text);
	}

	// clear
	public void Clear(WebElement clear, String text) {
		clear.sendKeys(text);
	}
}
