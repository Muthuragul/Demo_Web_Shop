package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAddress_Page 
{

	public AddNewAddress_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Address_FirstName")
	private WebElement FirstNameTextbox;
	
	@FindBy(id = "Address_LastName")
	private WebElement LastNameTextbox;
	
	@FindBy(id = "Address_Email")
	private WebElement EmailTextbox;
	
	@FindBy(id = "Address_CountryId")
	private WebElement CountryDropDown;
	
	@FindBy(id ="Address_City")
	private WebElement CityAddress;
	
	@FindBy(id = "Address_Address1")
	private WebElement Address;
	
	@FindBy(id = "Address_ZipPostalCode")
	private WebElement PostalCode;
	
	@FindBy(id = "Address_PhoneNumber")
	private WebElement PhoneNumber;

	@FindBy(xpath  = "//input[@value='Save']")
	private WebElement SaveBtn;
	
	public WebElement getFirstNameTextbox() {
		return FirstNameTextbox;
	}

	public WebElement getLastNameTextbox() {
		return LastNameTextbox;
	}

	public WebElement getEmailTextbox() {
		return EmailTextbox;
	}

	public WebElement getCountryDropDown() {
		return CountryDropDown;
	}

	public WebElement getCityAddress() {
		return CityAddress;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getPostalCode() {
		return PostalCode;
	}

	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	} 
	
	
}
