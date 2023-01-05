package com.SauceDemo.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass_HomePage 
{
	//1.WebDriver declared
		private WebDriver driver;


		@FindBy(xpath="//button[@id='react-burger-menu-btn']")
		private WebElement settingBtn;
		
		public void clickSettingBtn()
		{
			settingBtn.click();
		}
		
		@FindBy(xpath="//a[@id='logout_sidebar_link']")
		private WebElement logOutBtn;
		
		public void clickLogOutBtn()
		{
			logOutBtn.click();
		}
		
		//bagprdt
		@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
		WebElement bagProduct;
		
		public void clickBagProduct()
		{
			bagProduct.click();
		}
		
		
		//addToCart
		@FindBy(xpath="//span[@class='shopping_cart_badge']")
		WebElement addToCartBtn;
		
		public String getTextFromAddToCartBtn()
		{
			String totalProductSelected =addToCartBtn.getText();
		    return totalProductSelected; //1
		}

		//all products elements + action
		@FindBy(xpath="//button[text()='Add to cart']")
		List<WebElement> allProducts;
		
		public void clickAllProduct()
		{	
			  for(WebElement item : allProducts)
			  {
				  item.click();
			  }
		  
		}
		
		//4.constructor declare
		public POMClass_HomePage(WebDriver driver)
		{
			this.driver= driver;
			 PageFactory.initElements(driver, this);
		}



}
