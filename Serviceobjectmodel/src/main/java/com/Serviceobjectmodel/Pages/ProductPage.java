package com.Serviceobjectmodel.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Serviceobjectmodel.Utilities.PageUtilities;

public class ProductPage {
	
	public WebDriver driver;
	
	
	@FindBy(xpath="//div[@class='icheckbox_square-blue hover']")
	List<WebElement> checkFrock;

	@FindBy(xpath="//tr[@id='106']")
	List<WebElement> row;
	
	@FindBy(xpath="//i[@class='icon fa fa-tasks tip' and @data-placement='left']")
	WebElement line;
	
	@FindBy(xpath="//a[@class='bpo' and @data-html='true']")
WebElement deleteicon;
	public 	ProductPage(WebDriver driver)                  //giving constructor to pass driver value to findBy
	{
		this.driver=driver; 
		PageFactory.initElements(driver, this);   
		
	}
	public void checkbox()
	{
		
		for(WebElement obj:row)
		{
			obj.click();
		}
		
	}
	
	public void actionClass()
	{
		
		PageUtilities.clickOnElement(line);
		PageUtilities.clickOnElement(deleteicon);
		
	}
	
	
}
