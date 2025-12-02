package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page
{

	public Login_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath ="//input[@class='password']")
	private WebElement passwordtextField;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement LoginButton;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordtextField() {
		return passwordtextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	
	
}
