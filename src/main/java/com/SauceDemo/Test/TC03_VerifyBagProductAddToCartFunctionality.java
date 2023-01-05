package com.SauceDemo.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POM.POMClass_HomePage;

public class TC03_VerifyBagProductAddToCartFunctionality extends TestBaseClass
{
	@Test
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
