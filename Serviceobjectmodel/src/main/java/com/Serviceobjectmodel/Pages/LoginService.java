package com.Serviceobjectmodel.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginService {
	
	public WebDriver driver;
	@FindBy(xpath="//input[@name='identity']") //pagefactory means the annotation used @FinBy
	
	WebElement user;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement login;
	
	@FindBy(xpath="//h1[text()='Home']")
	WebElement homePage;
	@FindBy(xpath="//p[text()='Sign in to start your session']")
	WebElement loginPage;
	
	public LoginService(WebDriver driver)                  //giving constructor to pass driver value to findBy
	{
		this.driver=driver; //to pass value of driver into @FindBy
		PageFactory.initElements(driver, this);   // Interview question -page factoryde akathe method aanu initElements .frindby de driverlekk webdriver driver pass cheyyanam ivde blue and brown drivers aanu rand drivers und
		
	}
	
	public void setUserName(String userName) {
		
		user.sendKeys(userName);
	}

	public void setPassword(String password1) {
		
		password.sendKeys(password1);
	}

	public void clickSignin() {
		
		login.click();
	}
	public String verifyHome()
	{
		return homePage.getText();
	}
	public String verifyLogin()
	{
		return loginPage.getText();
	}
	
}



