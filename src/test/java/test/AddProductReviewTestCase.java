package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddProductReviewPage;
import pages.EmailPage;
import pages.HomePageClass;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.UserRegisterationPage;

public class AddProductReviewTestCase extends TestBaseClass {

	HomePageClass homeObject;
	UserRegisterationPage ObjectRegesteration;
	String Productname = "Apple MacBook Pro 13-inch";	
	SearchPage objectsearchproduct;	
	ProductDetailsPage productobjectdetails;
	AddProductReviewPage objectproductreviewpage;
// 1- user register
	@Test(priority = 1)
	public void userregesterationsucessfully ()
	{
		// new object driver from class HomePageClass
		homeObject = new HomePageClass (driver);
		homeObject.OpenRegisterationPage();

		ObjectRegesteration = new  UserRegisterationPage(driver);
		ObjectRegesteration.userRegisteration("shimaa", "Elsayed", "lkoyg@gmail.com", "127750");
		Assert.assertTrue(ObjectRegesteration.sucessmassege.getText().contains("Your registration completed"));
	}
	
// 2 - user search for product
	@Test(priority = 2)

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
// 3- add review product
	@Test(priority = 3)

	public void Registerdusercansendreviewproduct()
	{
		productobjectdetails.reviewbuttonlink();
		
		objectproductreviewpage = new AddProductReviewPage (driver);
		
		objectproductreviewpage.productreview("new review", "this is a good product");
		Assert.assertTrue(objectproductreviewpage.resultaddreview.getText().contains("Product review is successfully added."));
	}
	
// 4- logout
	@Test(priority = 4)

	
	public void Registerdusercanlogout ()
	{
		ObjectRegesteration.userlogout();
	}
	
	
	


}

