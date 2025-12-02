package com.DemoWebShop_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.DemoWebShop_GenericUtility.Base_Test;

import com.DemoWebShop_POM.Address_Page;

public class Tc_002_verify_user_Is_Able_To_Delete_Addresss_or_Not_Test extends Base_Test
{
	@Test
	public void addAddress () throws EncryptedDocumentException, IOException, InterruptedException
	{
		webDriverUtility.javaScriptScrollIntoView(driver, homePage.getAddressBtn());
		homePage.getAddressBtn().click();
		
		Address_Page addressPage = new Address_Page(driver);
		addressPage.getDeleteBtn().click();
		
		
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		webDriverUtility.webPageScreenShot(driver);
	}
	
}
