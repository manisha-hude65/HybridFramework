package com.vtiger.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vtiger.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseTest {
	
	
	
	
	@Test
	public void ValidLoginTC02()
	{
		String TCName = "ValidLoginTC02";
		logger = extent.createTest(TCName);	
		LoginPage lp = new LoginPage(driver,logger);
		lp.login(Data.get(TCName).get("Userid"), Data.get(TCName).get("Password"));	
		extent.flush();
	}

}
