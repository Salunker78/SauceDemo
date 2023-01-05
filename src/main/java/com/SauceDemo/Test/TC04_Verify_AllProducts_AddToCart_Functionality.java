package com.SauceDemo.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POM.POMClass_HomePage;


public class TC04_Verify_AllProducts_AddToCart_Functionality extends TestBaseClass
{
	
	@Test
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


}
