package com.DemoWebShop_POM;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page 
{

	public Address_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='Add new']")
	private WebElement AddNewBtn;

	public WebElement getAddNewBtn() {
		return AddNewBtn;
	}
	
	@FindBy(xpath = "//input[@value='Edit']")
	private WebElement EditBtn;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement DeleteBtn;

	public WebElement getEditBtn() {
		return EditBtn;
	}

	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}
	
	
}
