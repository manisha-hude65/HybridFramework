package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.common.CommonMethods;

public class LoginPage {
	
	private WebDriver driver;
	private CommonMethods cm;
	public ExtentTest logger;
	
	public LoginPage(WebDriver driver,ExtentTest logger)
	{
		this.driver = driver;
		this.logger=logger;
		PageFactory.initElements(driver, this);
		cm = new CommonMethods(driver,logger);
		
	}
	
	/*
    By tb_userid = By.name("user_name");
	By tb_userpwd = By.name("user_password");
	By btn_login = By.name("Login");
	*/
	
	@FindBy(name="user_name")
	WebElement tb_userid;
	
	@FindBy(name="user_password")
	WebElement tb_userpwd;
	
	@FindBy(name="Login")
	WebElement btn_login;
	
	public void login(String user,String pwd)
	{
		setUserid(user);
		setPassword(pwd);
		clickLogin();
	}
	
	public void setUserid(String userid) {
		cm.enterValue(tb_userid, userid,userid+" has been entered successfully in username textbox");
	}
	
	public void setPassword(String pwd) {
		cm.enterValue(tb_userpwd,pwd, pwd+" has been entered successfully in password textbox");
	}
	
	public void clickLogin() {
		cm.clickElement(btn_login,"Login button clicked successfully");
	}

}
