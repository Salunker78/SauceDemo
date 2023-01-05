package com.SauceDemo.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POM.POMClass_HomePage;

public class TC02_VerifyLogOutFunctionality extends TestBaseClass
{
	@Test
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


}
