package com.Serviceobjectmodel.Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.Serviceobjectmodel.Base.TestBaseService;
import com.Serviceobjectmodel.Pages.HomePage;
import com.Serviceobjectmodel.constants.Constants;


public class HomeTest extends TestBaseService {
	
	HomePage objHome;
	
@Test(priority=5,description="verify more info of Reparation tab ",groups= {"smoke"},retryAnalyzer=com.Serviceobjectmodel.Listeners.RetryAnalyzer.class)

	  public void verifyingReparation()
	  {
		 objHome=new HomePage(driver);
		objHome.reparationInfo();
		Assert.assertTrue(objHome.reparationInfoAssertion());
	  }

@Test(priority=7,description="verify column button in reparation page ",groups= {"smoke"},retryAnalyzer=com.Serviceobjectmodel.Listeners.RetryAnalyzer.class)

public void verifyingColumn()
{
	 objHome=new HomePage(driver);
	objHome.columnSelection();
	Assert.assertTrue(objHome.ColumnSelectionAssertion());
}

@Test(priority=8,description="verifynew column of reparation page is visible ",groups= {"smoke"},retryAnalyzer=com.Serviceobjectmodel.Listeners.RetryAnalyzer.class)

public void verifyingnewColumn()
{
	 objHome=new HomePage(driver);
objHome.newColumSelection();
Assert.assertTrue(objHome.newColumnAssertion());
}

	
@Test(priority=9,description="verify the checkbox is selectablev in column",groups= {"smoke"},retryAnalyzer=com.Serviceobjectmodel.Listeners.RetryAnalyzer.class)

	  public void verifyingColumnView()
	  {
		 objHome=new HomePage(driver);
objHome.checkBoxColumn();
Assert.assertTrue(objHome.checkBoxColumnAssertion());
	  }
	

@Test(priority=6,description="verify showdropdown  of Reparation table",groups= {"smoke"},retryAnalyzer=com.Serviceobjectmodel.Listeners.RetryAnalyzer.class)

public void verifyingshowdroping()
{
	
	 objHome=new HomePage(driver);
	
	objHome.showSelection(Constants.SHOWCOUNNTINDEX);
	
	Assert.assertEquals(objHome.gettingShoeSelectionText(), Constants.SHOWCOUNTTEXT);
	
}




@Test(priority=11,description="verify the page is move back to clientpage",groups= {"smoke"},retryAnalyzer=com.Serviceobjectmodel.Listeners.RetryAnalyzer.class)

public void verifyingurl()
{
	 objHome=new HomePage(driver);
objHome.navigation(Constants.path);
}



}
