package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchProductWithAutocompleteTestCase extends TestBaseClass{
String Productname = "Apple MacBook Pro 13-inch";	
SearchPage objectsearchproduct;	
ProductDetailsPage productobjectdetails;
@Test	
public void usercansearchwithautocomlete() {
	try {
		objectsearchproduct	 = new SearchPage (driver);
		objectsearchproduct.ProductsearchAutosuguest("MacB");
		productobjectdetails = new ProductDetailsPage (driver);
		Assert.assertTrue(productobjectdetails.productnamebreadCrmb.getText().equalsIgnoreCase(Productname));

	} catch (Exception e) {

	System.out.println("Error occures"+ e.getMessage());
	}


}
}