package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchProductTestCase extends TestBaseClass{

	String Productname = "Apple MacBook Pro 13-inch";
	SearchPage objectsearchproduct;
	
	ProductDetailsPage productobjectdetails;

	
@Test
	public void usercansearch() throws InterruptedException {
		
		objectsearchproduct	 = new SearchPage (driver);
		objectsearchproduct.searchforproduct(Productname);
		objectsearchproduct.openaccesslinkproduct();
		productobjectdetails = new ProductDetailsPage (driver);
		//Assert.assertTrue(productobjectdetails.productnamebreadCrmb.getText().equalsIgnoreCase(Productname));
        Assert.assertEquals(productobjectdetails.productnamebreadCrmb.getText(), Productname);
		
		
		Thread.sleep(5000);
		
	}
	
	
	
}
