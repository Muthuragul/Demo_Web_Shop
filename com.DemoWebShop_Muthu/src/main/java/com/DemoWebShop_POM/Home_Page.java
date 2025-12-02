package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page
{

	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log out")
	private WebElement logOutBtn;
	
	@FindBy(linkText = "Addresses")
	private WebElement addressBtn;

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

	public WebElement getAddressBtn() {
		return addressBtn;
	}
	
	
}
