package com.DemoWebShop_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.DemoWebShop_GenericUtility.Base_Test;
import com.DemoWebShop_POM.AddNewAddress_Page;
import com.DemoWebShop_POM.Address_Page;

public class Tc_001_verify_user_Is_Able_To_Add_Addresss_or_Not_Test extends Base_Test
{

	@Test
	public void addAddress () throws EncryptedDocumentException, IOException, InterruptedException
	{
		webDriverUtility.javaScriptClick(driver, homePage.getAddressBtn());
		homePage.getAddressBtn().click();
		
		Address_Page addressPage = new Address_Page(driver);
		addressPage.getAddNewBtn().click();
		
		AddNewAddress_Page addNewAddressPage = new AddNewAddress_Page(driver);
		
		addNewAddressPage.getFirstNameTextbox().sendKeys(fileutility.readDataFromExcelFile("Sheet1", 1, 0));
		addNewAddressPage.getLastNameTextbox().sendKeys(fileutility.readDataFromExcelFile("Sheet1", 1, 1));
		addNewAddressPage.getEmailTextbox().sendKeys(fileutility.readDataFromExcelFile("Sheet1", 1, 2));
		
		webDriverUtility.selectByVisibleText(addNewAddressPage.getCountryDropDown(),
				fileutility.readDataFromExcelFile("Sheet1", 1, 3));
		
		addNewAddressPage.getCityAddress().sendKeys(fileutility.readDataFromExcelFile("Sheet1", 1, 4));
		addNewAddressPage.getAddress().sendKeys(fileutility.readDataFromExcelFile("Sheet1", 1, 5));
		addNewAddressPage.getPostalCode().sendKeys(fileutility.readDataFromExcelFile("Sheet1", 1, 6));
		addNewAddressPage.getPhoneNumber().sendKeys(fileutility.readDataFromExcelFile("Sheet1", 1, 7));
		
		addNewAddressPage.getSaveBtn().click();
		
		Thread.sleep(2000);
		webDriverUtility.webPageScreenShot(driver);
	}
	
}
