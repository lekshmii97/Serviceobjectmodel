package com.Serviceobjectmodel.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Serviceobjectmodel.Utilities.FileUploadUtilities;
import com.Serviceobjectmodel.Utilities.PageUtilities;
import com.Serviceobjectmodel.Utilities.WaitUtilities;

public class HomePage {


	
	public WebDriver driver;
	
	
@FindBy(xpath="//div[@class='small-box bg-aqua']//child::a")
WebElement aqua;

          @FindBy(xpath="//h3[@class='box-title']")
          WebElement aquaassertion;

@FindBy(xpath="//div[@class='box-tools pull-right']//child::button//child::i")
WebElement filterclick;

@FindBy(xpath="//form[@method='post' and @accept-charset='utf-8']")
WebElement newfilter;

@FindBy(xpath="//select[@name='dynamic-table_length']")
WebElement showdropdowns;
	
@FindBy(xpath="//select[@name='dynamic-table_length']//child::option[1]")
WebElement showdropdown1;

@FindBy(xpath="//button[@tabindex='0' and @aria-controls='dynamic-table']")              //change
WebElement coulmnvisibility;
           @FindBy(xpath="//div[@class='dt-button-collection fixed two-column']")
           WebElement columnvisibilityassertion;


@FindBy(xpath="//div[@role='menu' and @class='dt-button-collection fixed two-column']")
WebElement newcolumn;
	
          @FindBy(xpath="//button[@class='dt-button buttons-collection buttons-colvis' and @aria-controls='dynamic-table']")
          WebElement newcolumnassertion;
          
@FindBy(xpath="//div[@class='dt-button-collection fixed two-column']//child::button[3]")
WebElement columnview;
           @FindBy(xpath="//button[@class='dt-button buttons-columnVisibility active' and @tabindex='0'][6]")
           WebElement columnviewassertion;



@FindBy(xpath="//input[@class='form-control input-sm input-xs' and @aria-controls='dynamic-table']")
WebElement search;

@FindBy(xpath="//tr[@id='109']")
WebElement firstrow;


@FindBy(xpath="//h4[@id='titclienti']")
WebElement assertionname;

@FindBy(xpath="//button[@class='add_reparation btn btn-primary']//i")
WebElement plusreparation;

@FindBy(xpath="//div[@style='display: block;' and @id='reparationmodal']/div/div")
WebElement addPlus;
	



public  HomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public void reparationInfo()
{
	PageUtilities.clickOnElement(aqua);
}
//assertion1
public boolean reparationInfoAssertion()
{
	boolean assertion1=aquaassertion.isDisplayed();
	return assertion1;
}


public void columnSelection()
{
	PageUtilities.clickOnElement(coulmnvisibility);
	
}

//assertion2

public boolean ColumnSelectionAssertion()
{
	
	boolean assertion2=columnvisibilityassertion.isDisplayed();
	return assertion2;
	
}


public boolean newColumSelection()
{
	boolean selection=newcolumn.isSelected();
	return selection;
}

//assertion3

public boolean newColumnAssertion()
{
	boolean assertion3=newcolumnassertion.isDisplayed();
	return assertion3;
}


public void checkBoxColumn()
{
	//WaitUtilities.waitForElementToBeClickable(driver,columnview);
	PageUtilities.clickOnElement(columnview);
	
}
 //assertion4

public boolean checkBoxColumnAssertion()
{
	boolean assertion4=columnviewassertion.isDisplayed();
	return assertion4;
	
}

public void search(String defect)
{
PageUtilities.enterText(search, defect);
}

//assertion5
public boolean searchrow()
{
	
	boolean assertionrow=firstrow.isDisplayed();
	return assertionrow;
}
public void filterSelection()
{
	WaitUtilities.fluentWait(driver, filterclick);
	PageUtilities.clickOnElement(filterclick);
}



public boolean newfilterSelection()
{
	boolean result=newfilter.isDisplayed();
	return result;
}





public void showSelection(int showcounnt)
{
	PageUtilities.selectClassDropdown(showdropdowns).selectByIndex(showcounnt);
	
}
public String gettingShoeSelectionText()
{
	return showdropdown1.getText();
}

public void navigation(String url)
{
	
	driver.navigate().to(url);
	
	
	
	
	
	
}

}