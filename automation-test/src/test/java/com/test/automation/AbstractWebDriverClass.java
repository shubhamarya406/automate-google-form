package com.test.automation;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractWebDriverClass {

	protected WebDriver webDriver;

	public AbstractWebDriverClass() {
		super();
	}

	@Before
	public void before() {
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
	}

	@After
	public void after() {
		System.out.println("After Executed");
		webDriver.quit();
	}

}