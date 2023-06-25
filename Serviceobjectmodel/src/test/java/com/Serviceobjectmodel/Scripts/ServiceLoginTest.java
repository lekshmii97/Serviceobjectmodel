package com.Serviceobjectmodel.Scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Serviceobjectmodel.Pages.LoginService;
import com.Serviceobjectmodel.Utilities.ExcelRead;
import com.Serviceobjectmodel.constants.Constants;
import com.Serviceobjectmodel.Base.TestBaseService;



public class ServiceLoginTest extends TestBaseService{ //inheritance
	
	LoginService objLogin; 
	@Test(dataProvider="invalidUserInvalidPassword",priority=1,groups={"smoke"},retryAnalyzer=com.Serviceobjectmodel.Listeners.RetryAnalyzer.class)
	  public void verifySigninInvalidUserInvalidpass(String userName,String password1) {
		  
		  objLogin=new LoginService(driver);
		  objLogin.setUserName(userName);
		  objLogin.setPassword(password1);
		  objLogin.clickSignin();
		  SoftAssert assert1=new SoftAssert();
		  assert1.assertEquals(driver.getTitle(), Constants.LOGINTITLE);
		  assert1.assertAll();
		  
		 
	  }
	
@Test(dataProvider="invalidUserValidpassword",priority=2)
public void verifySigninInvalidUserValidpass(String userName,String password1) {
	  
	  objLogin=new LoginService(driver);
	  objLogin.setUserName(userName);
	  objLogin.setPassword(password1);
	  objLogin.clickSignin();
	  SoftAssert assert1=new SoftAssert();
	  assert1.assertEquals(driver.getTitle(), Constants.LOGINTITLE);
	  assert1.assertAll();
	  
}

@Test(dataProvider="validUserInvalidPassword",priority=3)
public void verifySigninValidUserInvalidpass(String userName,String password1) {
	  
	  objLogin=new LoginService(driver);
	  objLogin.setUserName(userName);
	  objLogin.setPassword(password1);
	  objLogin.clickSignin();
	  SoftAssert assert1=new SoftAssert();
	  assert1.assertEquals(driver.getTitle(), Constants.LOGINTITLE);
	  assert1.assertAll();
	  
} 

@Test(dataProvider="validUserValidpassword",priority=4)
public void verifySigninValidUserValidpass(String userName,String password1) {
	  
	  objLogin=new LoginService(driver);
	  objLogin.setUserName(userName);
	  objLogin.setPassword(password1);
	  objLogin.clickSignin();
	  SoftAssert assert1=new SoftAssert();
	  assert1.assertEquals(driver.getTitle(), Constants.HOMETITLE);
	  assert1.assertAll();
	  
}


@DataProvider
public Object[][] invalidUserInvalidPassword() {
	  Object[][] data=new Object[1][2];
	  data[0][0]=ExcelRead.getCellStringData(0, 0, Constants.Sheet1);
	  data[0][1]=ExcelRead.getCellStringData(0, 1,Constants.Sheet1);
	  return data;
}

@DataProvider
public Object[][] invalidUserValidpassword() {
	  Object[][] data=new Object[1][2];
	  data[0][0]=ExcelRead.getCellStringData(1, 0, Constants.Sheet1);
	  data[0][1]=ExcelRead.getCellStringData(1, 1,Constants.Sheet1);
	  return data;
}

@DataProvider
public Object[][] validUserInvalidPassword() {
	  Object[][] data=new Object[1][2];
	  data[0][0]=ExcelRead.getCellStringData(2, 0, Constants.Sheet1);
	  data[0][1]=ExcelRead.getCellStringData(2, 1,Constants.Sheet1);
	  return data;
}

@DataProvider
public Object[][] validUserValidpassword() {
	  Object[][] data=new Object[1][2];
	  data[0][0]=ExcelRead.getCellStringData(3, 0, Constants.Sheet1);
	  data[0][1]=ExcelRead.getCellStringData(3, 1,Constants.Sheet1);
	  return data;
} 
  }
  
 






