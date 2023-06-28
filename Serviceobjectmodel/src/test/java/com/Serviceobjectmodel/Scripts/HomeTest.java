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

@Test(priority=8,description="verify column button in reparation page ")

public void verifyingColumn()
{
	 objHome=new HomePage(driver);
	objHome.columnSelection();
	Assert.assertTrue(objHome.ColumnSelectionAssertion());
}

@Test(priority=9,description="verifynew column of reparation page is visible ")

public void verifyingnewColumn()
{
	 objHome=new HomePage(driver);
objHome.newColumSelection();
Assert.assertTrue(objHome.newColumnAssertion());
}

	
@Test(priority=11,description="verify ")

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
	


@Test(priority=15,description="verifynew url")

public void verifyingurl()
{
	 objHome=new HomePage(driver);
objHome.navigation(Constants.path);
}
}
/*@Test(description="verify new verify filter")

public void verifyingNewResultFilter()
{
	 objHome=new HomePage(driver);
objHome.filterSelection();

Assert.assertTrue(objHome.newfilterSelection());
}*/

