package com.Serviceobjectmodel.Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.Serviceobjectmodel.Base.TestBaseService;
import com.Serviceobjectmodel.Pages.HomePage;
import com.Serviceobjectmodel.constants.Constants;


public class HomeTest extends TestBaseService {
	
	HomePage objHome;
	
	@Test(priority=6,description="verify more info of Reparation tab ")

	  public void verifyingReparation()
	  {
		 objHome=new HomePage(driver);
		objHome.reparationInfo();
	  }

	
	@Test(priority=9,description="verifynew column ")

	  public void verifyingColumnView()
	  {
		 objHome=new HomePage(driver);
objHome.waitColumn();
	  }
	
	
	@Test(priority=12,description="verify new verify filter")

	  public void verifyingNewResultFilter()
	  {
		 objHome=new HomePage(driver);
	objHome.newfilterSelection();
	  }

	
	@Test(priority=7,description="verify column ")

	  public void verifyingColumn()
	  {
		 objHome=new HomePage(driver);
		objHome.columnSelection();
	  }
	
	
@Test(priority=8,description="verifynew column ")

	  public void verifyingnewColumn()
	  {
		 objHome=new HomePage(driver);
	objHome.newColumSelection();
	  }
@Test(priority=10,description="verify showdrop")

public void verifyingshowdroping()
{
	 objHome=new HomePage(driver);
	
	objHome.showSelection(Constants.SHOWCOUNNTINDEX);
	//Assert.assertEquals(objHome.gettingShoeSelectionText(), Constants.SHOWCOUNTTEXT);
	Assert.assertEquals(objHome.gettingShoeSelectionText(), Constants.SHOWCOUNTTEXT);
	
}

/*@Test(priority=11,description="verifynew addplus ")

public void verifyingaddrep()
{
	 objHome=new HomePage(driver);
objHome.plusReparationISelection();
}

@Test(priority=12,description="verifynew neww addplus ")

public void verifyingnewaddrep()
{
	 objHome=new HomePage(driver);
objHome.newPlusReparation();
}
/*@Test(priority=13,description="verifynew column ")

public void verifyingnewmapka()
{
	 objHome=new HomePage(driver);
objHome.waitForElement();
}

@Test(priority=14,description="verifynew column ")

public void verifyingentermapka()
{
	 objHome=new HomePage(driver);
objHome.mapkaenter();
}
	/*@Test(priority=9,description="verifynew column ")

	  public void verifyingInternal()
	  {
		 objHome=new HomePage(driver);
	objHome.newInternal();
	  }*/
	

/*	@Test(priority=10,description="verify status ")

	  public void verifyingStatus()
	  {
		 objHome=new HomePage(driver);
		objHome.statusSelection();
	  }
	@Test(priority=11,description="verify newstatus ")

	  public void verifyingNewStatus()
	  {
		 objHome=new HomePage(driver);
		objHome.newStatusSelection();
	  }*/
	
	

/*	@Test(priority=12,description="verify addreparation ")

	  public void verifyingaddreparation()
	  {
		 objHome=new HomePage(driver);
		objHome.addReparationSelection();
	  }
	@Test(priority=13,description="verify addReparation tab ")

	  public void verifyingaddreparationtab()
	  {
		 objHome=new HomePage(driver);
		objHome.newaddedReparationSelection();
	  }
	
	
	/*@Test(priority=14,description="verify preparechecklist ")

	  public void verifyPrepareCheck()
	  {
		 objHome=new HomePage(driver);
		objHome.prepareChecklist();
	  }
	

	@Test(priority=15,description="verify preparechecklisttab ")

	  public void verifyPrepareChecktab()
	  {
		 objHome=new HomePage(driver);
		objHome.newPrepareChckSelection();
	  }
	

	@Test(priority=16,description="powerbutton ")

	  public void powerbutton()
	  {
		 objHome=new HomePage(driver);
		objHome.powerbuttonselection();
	  }
*/
/*@Test(priority=11,description="verify fiter ")

public void verifyingResultFilter()
{
	 objHome=new HomePage(driver);
	objHome.filterSelection();
}*/
/*@Test(priority=12,description="verify new verify filter")

public void verifyingEmailr()
{
	 objHome=new HomePage(driver);
objHome.scrollEmail();
}
@Test(priority=12,description="verify new verify filter")

public void verifyingMessage()
{
	 objHome=new HomePage(driver);
objHome.typeMessage();
}*/
	
}
	
	
	
	
	
