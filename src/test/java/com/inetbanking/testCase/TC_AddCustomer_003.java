package com.inetbanking.testCase;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddNewCustomerpage;
import com.inetbanking.pageObjects.BaseClass;
import com.inetbanking.pageObjects.LoginPage;



public class TC_AddCustomer_003 extends BaseClass {

	@Test
	public void addCustomer() throws InterruptedException {

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
		
		AddNewCustomerpage customer = new AddNewCustomerpage(driver);
		
		customer.clickonnewcustomer();
		customer.getcustomername("jim");
		customer.clickongender();
		customer.getdataofbirth("05/", "06/", "1985");
		Thread.sleep(3000);
		customer.getaddress("123 test");
		customer.getcity("tirupati");
		customer.getstate("ap");
		customer.getpinnuber("530567");
		customer.getphonenumber("7346207234");
		
		String email=randomestring()+"@gmail.com";
		customer.getemailid(email);
		customer.getpassword("We@12");
		customer.clickonsubmit();
		
        Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			Assert.assertTrue(false);
		}
			
	}

	}
	


