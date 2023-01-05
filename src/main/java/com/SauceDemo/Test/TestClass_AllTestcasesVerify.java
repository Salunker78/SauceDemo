package com.SauceDemo.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POM.POMClass_HomePage;

public class TestClass_AllTestcasesVerify extends TestBaseClass
{
	//login test case
	@Test(priority=1)
	public void verifyLoginFunctionality() throws IOException 
	{	
		//Validation
		log.info("Apply the Validation");
				
		String givenTitle = "Swag Labs";   //PO/BA/dev		
		String actualTitle = driver.getTitle();
				
		Assert.assertEquals(actualTitle, givenTitle);
	}
	
	//logout test case
	@Test(priority=4)
	public void verifyLogOutFunctionality()
	{
		POMClass_HomePage hp = new POMClass_HomePage(driver);
		//settingBtn
		hp.clickSettingBtn();
		log.info("Clicked on Setting Btn");
		
		//logOutBtn
		hp.clickLogOutBtn();
		log.info("Clicked on LogOut btn");
		
		//loginPage
		log.info("went on login page");
		
		//Validation
		log.info("Apply the Validation");
						
		String givenTitle = "Swag Labs";   //PO/BA/dev		
		String actualTitle = driver.getTitle();
						
		Assert.assertEquals(actualTitle, givenTitle);
						
	}	
	
	//All product selected test case
	@Test(priority=3)
	public void  verifyAllProductsAddToCartFunctionality() 
	{
		POMClass_HomePage hp = new POMClass_HomePage(driver);
		
		//allPrdtClick
		hp.clickAllProduct();
		log.info("Clicked on all Product");
		
		log.info("Apply the validation");
		
		String expectedProductSelection = "6";
		String actualProductSelected = hp.getTextFromAddToCartBtn();  //1
		
		Assert.assertEquals(actualProductSelected, expectedProductSelection);
	}
	
	//Single product selected
	@Test(priority=2)
	public  void verifyBagProductAddToCartFunctionality()
	{	
		POMClass_HomePage hp = new POMClass_HomePage(driver);
		
		//bagPrdtClick
		hp.clickBagProduct();
		log.info("Clicked on bagProduct");
		
		log.info("Apply the validation");
		String expectedProductSelection = "1";
		String actualProductSelected = hp.getTextFromAddToCartBtn();  //1
		
		Assert.assertEquals(actualProductSelected, expectedProductSelection);
			
	}


}
