package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EmailPage;
import pages.HomePageClass;
import pages.LoginPage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.UserRegisterationPage;

public class EmailFreind extends TestBaseClass {


	HomePageClass homeObject;
	UserRegisterationPage ObjectRegesteration;
	String Productname = "Apple MacBook Pro 13-inch";	
	SearchPage objectsearchproduct;	
	ProductDetailsPage productobjectdetails;
	EmailPage objectemailpage;
// 1- user register
	@Test(priority = 1)
	public void userregesterationsucessfully ()
	{
		// new object driver from class HomePageClass
		homeObject = new HomePageClass (driver);
		homeObject.OpenRegisterationPage();

		ObjectRegesteration = new  UserRegisterationPage(driver);
		ObjectRegesteration.userRegisteration("shimaa", "Elsayed", "bghc4e@gmail.com", "127750");
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
// 3- email friend 
	@Test(priority = 3)

	public void Registerdusercansendemailtofriend ()
	{
		productobjectdetails.openemailfriendbutton();
		
		objectemailpage = new EmailPage (driver);
		
		objectemailpage.contactus("shimaa.e33@yahoo.com", "massege for a new friend");
		Assert.assertTrue(objectemailpage.massegeemailsend.getText().contains("Your message has been sent"));
	}
	
// 4- logout
	@Test(priority = 4)

	
	public void Registerdusercanlogout ()
	{
		ObjectRegesteration.userlogout();
	}
	
	
	


}
