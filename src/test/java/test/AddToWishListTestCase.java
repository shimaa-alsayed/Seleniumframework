package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddToWishListPage;
import pages.HomePageClass;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class AddToWishListTestCase extends TestBaseClass{

	ProductDetailsPage	productobjectdetails;
	AddToWishListPage  ObjectAddToWishList;
	SearchPage           objectsearchproduct;
	String Productname = "Apple MacBook Pro 13-inch";	
    HomePageClass        objectHomePageClass;
	
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
public void addtowishlistsuccesssfully () throws InterruptedException 



{
	productobjectdetails = new ProductDetailsPage (driver);
	
	productobjectdetails.addandnavigatetowishlist();
	ObjectAddToWishList  = new AddToWishListPage (driver);
	objectHomePageClass = new HomePageClass (driver);
	
	Assert.assertTrue(ObjectAddToWishList.productnameinwishlist.getText().contains("Apple MacBook Pro 13-inch"));

	
	ObjectAddToWishList.removefromwishlist();
	Assert.assertTrue(ObjectAddToWishList.vrifiymassegeremoveproductfromwishlist.getText().contains("The wishlist is empty!"));
	
	Thread.sleep(4000);
	
	objectHomePageClass.getwishlistmenuelementsfrombar();
}







}