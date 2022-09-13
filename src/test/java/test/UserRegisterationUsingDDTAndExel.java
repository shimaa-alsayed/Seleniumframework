package test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.HomePageClass;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserRegisterationUsingDDTAndExel extends TestBaseClass {

	HomePageClass homeObject;
	UserRegisterationPage ObjectRegesteration;
	LoginPage loginObject;

	
	
	
	@DataProvider(name = "ExcelData")
	public  Object [][] userregesterationdate() throws IOException 
	
			{
		      ExcelReader Er = new ExcelReader ();
		      return Er.getexceldata();
			}
	
	
	
	
	
	
	
	@Test(priority = 1, dataProvider = "ExcelData")
	public void userregesterationsucessfully (String firstname , String LastName , String Email , String password)
	{
		// new object driver from class HomePageClass
		homeObject = new HomePageClass (driver);
		homeObject.OpenRegisterationPage();

		ObjectRegesteration = new  UserRegisterationPage(driver);
		ObjectRegesteration.userRegisteration(firstname,LastName ,Email ,password);
		Assert.assertTrue(ObjectRegesteration.sucessmassege.getText().contains("Your registration completed"));
		ObjectRegesteration.userlogout();
		homeObject.OpenLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.userlogin(Email , password);
		Assert.assertTrue(ObjectRegesteration.logoutLink.getText().contains("Log out"));
		ObjectRegesteration.userlogout();

	}
}
	


