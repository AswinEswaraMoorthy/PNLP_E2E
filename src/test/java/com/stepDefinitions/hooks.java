package com.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utils.Baseclass;
import com.utils.loadProperties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooks extends Baseclass {

	public static loginStepDefinition login;

	@Before
	public static void launchBrowser() throws Throwable {

		switch (loadProperties.getProperties("BROWSER")) {
		case "Chrome":

			driver = new ChromeDriver();
			break;
		case "firefox":

			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Unsupported browser: ");
		}

		driver.manage().window().maximize();
	

		

	}

	@After
	public void close() {

		if (driver != null) {
			//driver.quit();
		}

	}

}
