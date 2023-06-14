package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerpage {

	WebDriver ldriver;

	public AddNewCustomerpage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@href='addcustomerpage.php']")
	WebElement newCustomer;

	@FindBy(xpath = "//input[@name='name']")
	WebElement customerName;

	@FindBy(xpath = "//input[@value='m']")
	WebElement gender;

	@FindBy(name = "dob")
	WebElement dataofbirth;

	@FindBy(name = "addr")
	WebElement address;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(name = "state")
	WebElement state;

	@FindBy(name = "pinno")
	WebElement pinnumber;

	@FindBy(name = "telephoneno")
	WebElement cellnumber;

	@FindBy(name = "emailid")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "sub")
	WebElement submit;

	public void clickonnewcustomer() {
		newCustomer.click();
	}

	public void getcustomername(String name) {
		customerName.sendKeys(name);
	}

	public void clickongender() {
		gender.click();
	}

	public void getdataofbirth(String mm, String dd, String yy) {
		dataofbirth.sendKeys(mm);
		dataofbirth.sendKeys(dd);
		dataofbirth.sendKeys(yy);
	}

	public void getaddress(String add) {
		address.sendKeys(add);
	}

	public void getcity(String ci) {
		city.sendKeys(ci);
	}

	public void getstate(String st) {
		state.sendKeys(st);
	}

	public void getpinnuber(String pin) {
		pinnumber.sendKeys(pin);
	}

	public void getphonenumber(String phone) {
		cellnumber.sendKeys(phone);
	}

	public void getemailid(String emailid) {
		email.sendKeys(emailid);
	}

	public void getpassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickonsubmit() {
		submit.click();
	}

}
