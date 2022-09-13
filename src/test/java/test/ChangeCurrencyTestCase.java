package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePageClass;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class ChangeCurrencyTestCase extends TestBaseClass{
	HomePageClass objecthomepage ;
	ProductDetailsPage objectProductDetailsPage;
	String Productname = "Apple MacBook Pro 13-inch";	
	SearchPage objectsearchproduct;	
	
	
	@Test(priority = 1)
public void contactwithus () {
		
	objecthomepage = new HomePageClass (driver);
	objecthomepage.changecurrencydropdownelements();
    	}
	@Test(priority = 2)

	public void usercansearchwithautocomlete() {
		try {
			objectsearchproduct	 = new SearchPage (driver);
			objectsearchproduct.ProductsearchAutosuguest("MacB");
			objectProductDetailsPage = new ProductDetailsPage (driver);
			Assert.assertEquals(objectProductDetailsPage.productnamebreadCrmb.getText(),Productname);
			Assert.assertTrue(objectProductDetailsPage.productprice.getText().contains("€"));
			System.out.println("objectProductDetailsPage.productprice.getText() ");
		} catch (Exception e) {

		System.out.println("Error occures"+ e.getMessage());
		}

}}
