package com.Serviceobjectmodel.Scripts;

import org.testng.annotations.Test;

import com.Serviceobjectmodel.Base.TestBaseService;
import com.Serviceobjectmodel.Pages.ProductPage;
import com.Serviceobjectmodel.constants.Constants;

public class ProductTest extends TestBaseService {

	ProductPage objProduct;

	@Test(priority = 11, description = "verify the entire row is selected in product page", groups = {"smoke" }, retryAnalyzer = com.Serviceobjectmodel.Listeners.RetryAnalyzer.class)
	public void verifyrow() {

		objProduct = new ProductPage(driver);
		objProduct.checkbox();

	}

	@Test(priority = 12, description = "Verify the action button in the  table", groups = {"smoke" }, retryAnalyzer = com.Serviceobjectmodel.Listeners.RetryAnalyzer.class)
	public void verifyaction() {

		objProduct = new ProductPage(driver);
		objProduct.checkbox();

	}

	@Test(priority = 13, description = "Verify that the selected row is deleted in the table", groups = {"smoke" }, retryAnalyzer = com.Serviceobjectmodel.Listeners.RetryAnalyzer.class)
	public void verifyactionClass() {

		objProduct = new ProductPage(driver);
		objProduct.actionClass();

	}
	
	@Test(priority = 14, description = "verify the product page is navigated to the Rapartion page", groups = {"smoke" }, retryAnalyzer = com.Serviceobjectmodel.Listeners.RetryAnalyzer.class)
public void verifynavigation() {

objProduct = new ProductPage(driver);
objProduct.navigation(Constants.raparation);

}


	@Test(priority = 15, description = "verify the file is uploaded", groups = {"smoke" }, retryAnalyzer = com.Serviceobjectmodel.Listeners.RetryAnalyzer.class)
	public void verifypictureisuploaded() {

		objProduct = new ProductPage(driver);
	objProduct.FileStream(Constants.pathstream);

	}

	
	
}
