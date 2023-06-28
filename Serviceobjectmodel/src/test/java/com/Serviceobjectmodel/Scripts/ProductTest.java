package com.Serviceobjectmodel.Scripts;

import org.testng.annotations.Test;

import com.Serviceobjectmodel.Base.TestBaseService;
import com.Serviceobjectmodel.Pages.ProductPage;

public class ProductTest extends TestBaseService{
	
	ProductPage objProduct;
  @Test(priority=16)
  public void verifyrow() {
	  
	  objProduct=new ProductPage(driver);
	  objProduct.checkbox();
	  
  }
  
  @Test(priority=17)
  public void verifyaction() {
	  
	  objProduct=new ProductPage(driver);
	objProduct.checkbox();
	  
  }
  
  @Test(priority=18)
  public void verifyactionClass() {
	  
	  objProduct=new ProductPage(driver);
	objProduct.actionClass();
	  
  }
}
