package com.Serviceobjectmodel.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Serviceobjectmodel.Utilities.PageUtilities;
import com.Serviceobjectmodel.Utilities.WaitUtilities;
import com.Serviceobjectmodel.constants.Constants;

public class HomePage {


	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='emailto_']")
	WebElement email;
	
	@FindBy(xpath="//textarea[@id='body_']")
	WebElement message;
	
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

@FindBy(xpath="//button[starts-with(@class,'add_reparation ')]")
WebElement addreparation;



@FindBy(xpath="//div[@id='reparationmodal' and @class='modal fade in']/div/div")
WebElement newaddReparationBox;

/*@FindBy(xpath="//button[@class='prerepair_show btn btn-primary']")
WebElement preRepairCheck;

@FindBy(xpath="//h4[text()='Pre Repair Checklist']")
WebElement prePareCheckColumn;

@FindBy(xpath="//label[@for='checktoggle_506f77657220427574746f6e']")
WebElement powerbutton;*/

@FindBy(xpath="//button[@class='dt-button buttons-columnVisibility active' and @aria-controls='dynamic-table-completed'][1]")
WebElement internal;

@FindBy(xpath="//button[@tabindex='0' and @aria-controls='dynamic-table']")
WebElement coulmnvisibility;

	@FindBy(xpath="//div[@role='menu' and @class='dt-button-collection fixed two-column']")
	WebElement newcolumn;
	

	
	@FindBy(xpath="//span[@class='row_status label' and @data-repair='202']")
	WebElement status;
	
	@FindBy(xpath="//h4[@id='myModalLabel']//parent::div")
	WebElement updatestatus;
	/*@FindBy(xpath="//button[@data-widget='collapse']//child::i")
	WebElement stockchart;

	 @FindBy(xpath="//div[@id='stock-chart']")
	    WebElement stocktable;         
	@FindBy(xpath="//span[text()='1:56a']")
	WebElement event;
	
	@FindBy(xpath="//div[text()='Are you sure?']")
	WebElement alerttab;
	
	
	@FindBy(xpath="//button[@class='btn btn-box-tool']//child::i")
	WebElement plusicon;
	*/


public  HomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

/*public void scrollEmail()
{
	
	PageUtilities.scrollWindow(driver,email );
}

public void typeMessage()
{
	message.sendKeys("hello world");
	
}*/
public void reparationInfo()
{
	PageUtilities.clickOnElement(aqua);
}

public void filterSelection()
{
	filterresult.click();
}

public boolean newfilterSelection()
{
	boolean result=newfilter.isDisplayed();
	return result;
}


public void columnSelection()
{
	PageUtilities.clickOnElement(coulmnvisibility);
	
}
/*public boolean newColumSelection()
{
	boolean selection=newcolumn.isSelected();
	return selection;
}



public boolean newInternal()
{
	PageUtilities.clickOnElement(internal);
	boolean internals=internal.isSelected();
	return internals;
}*/


/*public  void statusSelection()
{
	
	status.click();
}

public boolean newStatusSelection()
{
	boolean selectors=updatestatus.isSelected();
	return selectors;
}*/

public void showSelection(int showcounnt)
{
	PageUtilities.selectClassDropdown(driver, showdropdowns).selectByIndex(showcounnt);
	//PageUtilities.selectClassDropdown(driver,showdropdowns ).selectByVisibleText(gettingShoeSelectionText());
}
public String gettingShoeSelectionText()
{
	return showdropdown1.getText();
}
public void addReparationSelection()
{
	PageUtilities.clickOnElement(addreparation);
}

public boolean newaddedReparationSelection()
{
	boolean selectreparation=newaddReparationBox.isSelected();
	return selectreparation;
}
/*public void prepareChecklist()
{
	preRepairCheck.click();
	
}
public boolean newPrepareChckSelection()
{
	boolean preparecheckselect=prePareCheckColumn.isDisplayed();
	return preparecheckselect;
}
public void powerbuttonselection()
{
	powerbutton.click();
}*/
}