package com.Serviceobjectmodel.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Serviceobjectmodel.Utilities.PageUtilities;
import com.Serviceobjectmodel.Utilities.WaitUtilities;

public class ProductPage {

	public WebDriver driver;

	@FindBy(xpath = "//div[@class='icheckbox_square-blue hover']")
	List<WebElement> checkFrock;

	@FindBy(xpath = "//tr[@id='106']")
	List<WebElement> row;

	@FindBy(xpath = "//i[@class='icon fa fa-tasks tip' and @data-placement='left']")
	WebElement line;

	@FindBy(xpath = "//a[@class='bpo' and @data-html='true']")
	WebElement deleteicon;

	
	@FindBy(xpath="//button[@class='add_reparation btn btn-primary' and text()=' Add Reparation            ']")
	WebElement addRepar;
	
	@FindBy(xpath="//a[@id='add_client']")
	WebElement clickclientRepar;
	
	@FindBy(xpath="//input[@id='image']")
	WebElement browse;
	
	public ProductPage(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void checkbox() {

		for (WebElement obj : row) {
			obj.click();
		}

	}

	public void actionClass() {

		PageUtilities.clickOnElement(line);
		PageUtilities.clickOnElement(deleteicon);

	}

	public void navigation(String urlraparation)

	{

		driver.navigate().to(urlraparation);

	}
	
	public void FileStream(String path)
	{
		PageUtilities.clickOnElement(addRepar);
		WaitUtilities.waitForElementToBeVisible(driver,clickclientRepar);
		PageUtilities.clickOnElement(clickclientRepar);
		
		browse.sendKeys(path);
	}
	
	

}
