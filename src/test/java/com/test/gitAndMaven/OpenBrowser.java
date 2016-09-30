package com.test.gitAndMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenBrowser {	

	@Test
	public void OpenBrowserTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void OpenBrowserTest2()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.print("hello");
		System.out.print("hello1");
	}
}
