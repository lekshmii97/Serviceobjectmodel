package com.Serviceobjectmodel.Scripts;

import org.testng.annotations.Test;

import com.Serviceobjectmodel.Base.TestBaseService;
import com.Serviceobjectmodel.Pages.ProductPage;

public class ProductTest extends TestBaseService{
	
	ProductPage objProduct;
  @Test(priority=14,description="verify the entire row is selected",groups= {"smoke"},retryAnalyzer=com.Serviceobjectmodel.Listeners.RetryAnalyzer.class)
  public void verifyrow() {
	  
	  objProduct=new ProductPage(driver);
	  objProduct.checkbox();
	  
  }
  
  @Test(priority=15,description="Verify the action button",groups= {"smoke"},retryAnalyzer=com.Serviceobjectmodel.Listeners.RetryAnalyzer.class)
  public void verifyaction() { 
	  
	  objProduct=new ProductPage(driver);
	objProduct.checkbox();
	  
  }
  
  @Test(priority=16,description="",groups= {"smoke"},retryAnalyzer=com.Serviceobjectmodel.Listeners.RetryAnalyzer.class)
  public void verifyactionClass() {
	  
	  objProduct=new ProductPage(driver);
	objProduct.actionClass();
	  
  }
}
