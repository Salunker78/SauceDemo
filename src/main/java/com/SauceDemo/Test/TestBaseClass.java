package com.SauceDemo.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POM.POMClass_LoginPage;


public class TestBaseClass 
{
    WebDriver driver;
    Logger log = Logger.getLogger("SauceDemo");
    
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		  System.setProperty("webdriver.chrome.driver", 
					"./DriverFolder/chromedriver.exe");	

		    driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			 System.setProperty("webdriver.gecko.driver", 
						"./DriverFolder/geckodriver.exe");	

			    driver = new FirefoxDriver();
		}
		
		PropertyConfigurator.configure("log4j.properties");
		log.info("Browser is opened");
			
			
			driver.manage().window().maximize();
			log.info("Browser is maximized");

			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.saucedemo.com/");
			log.info("Url is opened");
			
			POMClass_LoginPage lp = new POMClass_LoginPage(driver);
			lp.sendUsername();
			log.info("username is entered");
			
			lp.sendPassword();
			log.info("password entered");
			
			lp.clickLoginButton();
			log.info("clicked on login button");
			
			//--homePage--//
			log.info("Went on HomePage");
	}

			@AfterMethod
			public void tearDown()
			{
				driver.quit();
				log.info("browser is closed");
						
				log.info("End of Program");
		    }


}
