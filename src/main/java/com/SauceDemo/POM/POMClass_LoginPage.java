package com.SauceDemo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass_LoginPage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
    @FindBy(xpath="//input[@id='password']")
    private WebElement password;
	 
	 @FindBy(xpath="//input[@id='login-button']")
	 private WebElement loginBtn;
	 
	 //3.Ele --> action perform
	 public void sendUsername()
	 {
		 username.sendKeys("standard_user");
	 }
	 
	 public void sendPassword()
	 {
		 password.sendKeys("secret_sauce");
	 }
	 
	 public void clickLoginButton()
	 {
		 loginBtn.click();
	 }

    //4.constructor declare 
	 public POMClass_LoginPage(WebDriver driver)
	 {
		 this.driver= driver;
		 PageFactory.initElements(driver, this);
	 }


}
