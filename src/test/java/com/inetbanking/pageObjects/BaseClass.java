package com.inetbanking.pageObjects;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {

	public static WebDriver driver;
	
	public static Logger logger;
	
	ReadConfig readconfig = new ReadConfig();
	
	
	/*
	 * public String baseurl = readconfig.getApplicationURL();
	 * 
	 * public String userName = readconfig.getUsername();
	 * 
	 * public String password = readconfig.getPassword();
	 */
	 
	
	
	  public String baseurl = "https://demo.guru99.com/V4/";
	  
	  public String userName = "mngr505079";
	  
	  public String password = "EsevEjy";
	 
	 

	@BeforeClass
	public void setup() {
		 ChromeOptions option = new ChromeOptions();
         option.addArguments("--remote-allow-origins=*");
           driver = new ChromeDriver(option);
        logger = Logger.getLogger("ebanking");
        PropertyConfigurator.configure("log4j.Properties");
	}
 
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}
}
