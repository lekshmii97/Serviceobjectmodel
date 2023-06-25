package com.Serviceobjectmodel.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Serviceobjectmodel.Utilities.PageUtilities;
import com.Serviceobjectmodel.Utilities.WaitUtilities;

public class HomePage {


	
	public WebDriver driver;
	
	
@FindBy(xpath="//div[@class='small-box bg-aqua']//child::a")
WebElement aqua;

@FindBy(xpath="//i[@class='fa fa-plus']")
WebElement filterresult;

@FindBy(xpath="//form[@method='post' and @accept-charset='utf-8']")
WebElement newfilter;

@FindBy(xpath="//select[@name='dynamic-table_length']")
WebElement showdropdowns;
	
@FindBy(xpath="//select[@name='dynamic-table_length']//child::option[1]")
WebElement showdropdown1;

@FindBy(xpath="//button[@tabindex='0' and @aria-controls='dynamic-table']")
WebElement coulmnvisibility;

	@FindBy(xpath="//div[@role='menu' and @class='dt-button-collection fixed two-column']")
	WebElement newcolumn;
	
@FindBy(xpath="//div[@class='dt-button-collection fixed two-column']//child::button[3]")
WebElement columnview;

/*@FindBy(xpath="//input[@class='select2-search__field']")
WebElement mapka;*/

/*@FindBy(xpath="//button[@class='dt-button buttons-columnVisibility active' and @aria-controls='dynamic-table-completed'][1]")
WebElement internal;*/

@FindBy(xpath="//button[@class='add_reparation btn btn-primary']//i")
WebElement plusreparation;

@FindBy(xpath="//div[@style='display: block;' and @id='reparationmodal']/div/div")
WebElement addPlus;
	
	/*@FindBy(xpath="//span[@class='row_status label' and @data-repair='202']")
	WebElement status;
	
	@FindBy(xpath="//h4[@id='myModalLabel']//parent::div")
	WebElement updatestatus;*/
	


public  HomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public void reparationInfo()
{
	PageUtilities.clickOnElement(aqua);
}

public void filterSelection()
{
	PageUtilities.clickOnElement(filterresult);
}

/*public void waitForElement()
{
WaitUtilities.waitForElementToBeClickable(driver, mapka);
}
public void mapkaenter()
{
	mapka.sendKeys("hendry");
	
}*/

public boolean newfilterSelection()
{
	boolean result=newfilter.isDisplayed();
	return result;
}


public void columnSelection()
{
	PageUtilities.clickOnElement(coulmnvisibility);
	
}
public boolean newColumSelection()
{
	boolean selection=newcolumn.isSelected();
	return selection;
}

public void waitColumn()
{
	WaitUtilities.waitForElementToBeClickable(driver,columnview);
	PageUtilities.clickOnElement(columnview);
	
}
public void plusReparationISelection()
{
	PageUtilities.clickOnElement(plusreparation);
}

public boolean newPlusReparation()
{
	boolean addplusselection=addPlus.isDisplayed();
	return addplusselection;
}


public void showSelection(int showcounnt)
{
	PageUtilities.selectClassDropdown(driver, showdropdowns).selectByIndex(showcounnt);
	//PageUtilities.selectClassDropdown(driver,showdropdowns ).selectByVisibleText(gettingShoeSelectionText());
}
public String gettingShoeSelectionText()
{
	return showdropdown1.getText();
}

}