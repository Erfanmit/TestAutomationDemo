package com.selenium.git.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitPractice {
	
	WebDriver driver;
	
	@Test
	public void openBrowser()
	{	
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com/");
	}
	
	
	
}
