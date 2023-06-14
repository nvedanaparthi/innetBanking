package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;

		PageFactory.initElements(ldriver, this);

	}

	@FindBy(name = "uid")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "btnLogin")
	WebElement click;

	@FindBy(xpath = "//a[@href='Logout.php']")
	WebElement logout;

	public void setusername(String frName) {
		username.sendKeys(frName);

	}

	public void setpassword(String laName) {
		password.sendKeys(laName);

	}

	public void clicklogin() {
		click.click();

	}

	public void clickLOgout() {
		logout.click();
	}

}
