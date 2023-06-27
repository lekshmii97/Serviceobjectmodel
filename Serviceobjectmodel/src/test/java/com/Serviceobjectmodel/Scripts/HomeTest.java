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
		Assert.assertTrue(objHome.reparationInfoAssertion());
	  }

@Test(priority=8,description="verify column button  ")

public void verifyingColumn()
{
	 objHome=new HomePage(driver);
	objHome.columnSelection();
	Assert.assertTrue(objHome.ColumnSelectionAssertion());
}

@Test(priority=9,description="verifynew column  ")

public void verifyingnewColumn()
{
	 objHome=new HomePage(driver);
objHome.newColumSelection();
Assert.assertTrue(objHome.newColumnAssertion());
}

	
@Test(priority=10,description="verifynew column singlebuttons")

	  public void verifyingColumnView()
	  {
		 objHome=new HomePage(driver);
objHome.checkBoxColumn();
Assert.assertTrue(objHome.checkBoxColumnAssertion());
	  }
	

@Test(priority=10,description="verify showdrop")

public void verifyingshowdroping()
{
	 objHome=new HomePage(driver);
	
	objHome.showSelection(Constants.SHOWCOUNNTINDEX);
	
	Assert.assertEquals(objHome.gettingShoeSelectionText(), Constants.SHOWCOUNTTEXT);
	
}


@Test(priority=7,description="verify search")

public void verifyingsearch()
{
	 objHome=new HomePage(driver);
	
	objHome.search(Constants.Searchtext);
	Assert.assertTrue(objHome.searchrow());
	
}
	
@Test(description="verify new verify filter")

	  public void verifyingNewResultFilter()
	  {
		 objHome=new HomePage(driver);
	objHome.filterSelection();
	
	Assert.assertTrue(objHome.newfilterSelection());
	  }

	

	


@Test(priority=13,description="verify add")

public void verifyingadd()
{
	 objHome=new HomePage(driver);
	objHome.Reparations();
}

@Test(priority=14,description="verify addclient")

public void verifyingname()
{
	 objHome=new HomePage(driver);
	objHome.addClient();
	
}

@Test(priority=15,description="verify nameclient")

public void verifyingnameclient()
{
	 objHome=new HomePage(driver);
	objHome.nameOfclient(Constants.NAME);
	Assert.assertTrue(objHome.verifYnameassertion());
	
}



}













/*

@Test(priority=12,description="verify addpic")

public void verifyingaddpicture()
{
	 objHome=new HomePage(driver);
	objHome.addpicture();
}


@Test(priority=13,description="verify addpicvisibility")

public void verifyingaddpicturevisible()
{
	 objHome=new HomePage(driver);
	objHome.visiblePicture();
}


@Test(priority=14,description="verify upload")

public void verifyingupload()
{
	 objHome=new HomePage(driver);
	objHome.FileUpload();
	 StringSelection s = new StringSelection("D:\\Screenshot_2019-02-18-19-04-49.png");
	 
}

@Test(priority=12,description="verify addclient")

public void verifyingaddclient()
{
	 objHome=new HomePage(driver);
	
objHome.addClient();
	
}

@Test(priority=13,description="verify clientname")

public void verifyingclentname()
{
	 objHome=new HomePage(driver);
	objHome.clientName();
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
	

	
	
	
	
	
