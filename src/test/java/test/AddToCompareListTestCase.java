package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddToComparePage;
import pages.AddToWishListPage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class AddToCompareListTestCase extends TestBaseClass{
	ProductDetailsPage	productobjectdetails;
	AddToComparePage  ObjectAddToComparePage;
	SearchPage           objectsearchproduct;
	String Productname = "Apple MacBook Pro 13-inch";	

	
	@Test(priority = 1) 

	public void usercansearchwithautocomlete() {
		try {
			objectsearchproduct	 = new SearchPage (driver);
			objectsearchproduct.ProductsearchAutosuguest("MacB");
			productobjectdetails = new ProductDetailsPage (driver);
			Assert.assertTrue(productobjectdetails.productnamebreadCrmb.getText().equalsIgnoreCase(Productname));

		} catch (Exception e) {

		System.out.println("Error occures"+ e.getMessage());
		}}
	
		@Test(priority = 2)
public void addtocomparelistsuccesssfully () 



{
	productobjectdetails = new ProductDetailsPage (driver);
	
	productobjectdetails.addtocomparelist();
	ObjectAddToComparePage  = new AddToComparePage (driver);

	
	Assert.assertTrue(ObjectAddToComparePage.productnamecomparelist.getText().contains("Apple MacBook Pro 13-inch"));

	
	ObjectAddToComparePage.removefromcomparelist();
	Assert.assertTrue(ObjectAddToComparePage.vrifiymassegeremoveproductfromcomparelist.getText().contains("You have no items to compare."));
    
}

}
