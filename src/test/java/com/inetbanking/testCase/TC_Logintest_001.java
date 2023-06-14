package com.inetbanking.testCase;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.BaseClass;
import com.inetbanking.pageObjects.LoginPage;


public class TC_Logintest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException, IOException {
		
	    driver.get(baseurl);
	    logger.info("URL is opened");
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage lp = new LoginPage(driver);
		
		lp.setusername(userName);
		logger.info("UserName entered");
		lp.setpassword(password);
		logger.info("PassWord entered");
		lp.clicklogin();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("logging test is passed");
		}
		else
		{
			captureScreen(driver, "LoginTest");
			Assert.assertTrue(false);
			logger.info("logging test is failed");
		}
		
		
		
	}
	
	

}
