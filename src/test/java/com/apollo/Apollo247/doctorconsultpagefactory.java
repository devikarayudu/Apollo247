package com.apollo.Apollo247;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class doctorconsultpagefactory {
    WebDriver driver=null;
	@FindBy(xpath="//span[@class=\"icon-ic_account\"]")
	public WebElement login;
	@FindBy(xpath="//input[@name=\"mobileNumber\"]")
	public WebElement mobileno;
	@FindBy(css="span[class=\"MuiFab-label\"]")
	public WebElement mobileArrow;
	@FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement otpArrow;
	@FindBy(xpath="//span[@class=\"icon-ic_arrow_forward\"]")
	public WebElement login1;
	@FindBy(xpath="//p[text()='Consult']")
	public WebElement consultbtn;
	@FindBy(xpath="//input[@placeholder='Search doctors or specialities']")
	public WebElement search;
//	@FindBy(xpath="//h6[@class=\"MuiTypography-root MuiTypography-body1\"]")
//	public WebElement cities;
//	@FindBy(xpath="//a[@href=\"/doctors/doctors-in-bangalore-dcity\"]")
//	public WebElement bangolore;
//	@FindBy(xpath="//a[@href=\"/specialties/dermatology\"]")
//	public WebElement dermatology;
	
	public doctorconsultpagefactory(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
	public void Login()
	{
		login.click();
		
	}
	public void MobileNumber()
	{
		mobileno.click();
		mobileno.sendKeys("9381336112");
		
	}
	public void submit()
	{
		otpArrow.click();
	}
	public void Arrow()
	{
		login1.click();
	}
//	public void Consult()
//	{
//		consultbtn.click();
//	}
//	public void Search_doctors_or_specialities()
//	{
//		search.click();
//	}
	
	
	
}
