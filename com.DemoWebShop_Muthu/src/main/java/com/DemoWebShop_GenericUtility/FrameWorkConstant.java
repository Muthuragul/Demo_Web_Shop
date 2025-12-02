package com.DemoWebShop_GenericUtility;

public interface FrameWorkConstant
{
	JavaUtility ju = new JavaUtility();
	
	 String propertyPath = "./src/test/resources/testData/data.properties"; 
	
	 String excelPath = "./src/test/resources/testData/data.xlsx";
	
	 String screenShotPath = "./screenshots/"+ ju.localDateAndTime() +".png";
	 
	 String reportsPath = "./reports/"+ ju.localDateAndTime() +".html";
}
