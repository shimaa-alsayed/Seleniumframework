 package test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePageClass;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserRegisterationusingDDTAndDataProvider extends TestBaseClass {

	HomePageClass homeObject;
	UserRegisterationPage ObjectRegesteration;
	LoginPage loginObject;

	@DataProvider(name = "testData")
	
	public static Object [][] userData ()
	{
	return new Object [] [] {
		
		{"Motaz" , "Nabil" , "dh.o44@yahoo.com", "123456"},
		{"Ahmed" , "Ali" , "tgn.o44@yahoo.com", "12345678"}};
	
	}
	
	
	
	
	
	@Test(priority = 1, dataProvider = "testData")
	public void userregesterationsucessfully (String fname, String lname , String email , String Password)
	{
		// new object driver from class HomePageClass
		homeObject = new HomePageClass (driver);
		homeObject.OpenRegisterationPage();

		ObjectRegesteration = new  UserRegisterationPage(driver);
		ObjectRegesteration.userRegisteration(fname,lname,email,Password);
		Assert.assertTrue(ObjectRegesteration.sucessmassege.getText().contains("Your registration completed"));
		ObjectRegesteration.userlogout();
		homeObject.OpenLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.userlogin(email, Password);
		Assert.assertTrue(ObjectRegesteration.logoutLink.getText().contains("Log out"));
		ObjectRegesteration.userlogout();


	}
	
}

