package test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.LoadProperities;
import pages.HomePageClass;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserRegisterationUsingDDTAndProperitesFile extends TestBaseClass {

	HomePageClass homeObject;
	UserRegisterationPage ObjectRegesteration;
	LoginPage loginObject;
    String Firstname = LoadProperities.userdata.getProperty("firstname");
    String Lastname = LoadProperities.userdata.getProperty("secondname");
    String Email = LoadProperities.userdata.getProperty("email");
    String Password = LoadProperities.userdata.getProperty("password");

	
	
	@Test(priority = 1)
	public void userregesterationsucessfully ()
	{
		// new object driver from class HomePageClass
		homeObject = new HomePageClass (driver);
		homeObject.OpenRegisterationPage();

		ObjectRegesteration = new  UserRegisterationPage(driver);
		ObjectRegesteration.userRegisteration(Firstname, Lastname,Email,Password );
		Assert.assertTrue(ObjectRegesteration.sucessmassege.getText().contains("Your registration completed"));
	}
	@Test(dependsOnMethods = "userregesterationsucessfully")
	public void Registerdusercanlogout ()
	{
		ObjectRegesteration.userlogout();
	}
	@Test(dependsOnMethods = "Registerdusercanlogout")
	public void userloginsucessfully () throws InterruptedException {

		homeObject.OpenLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.userlogin(Email, Password);
		Thread.sleep(5000);
		Assert.assertTrue(ObjectRegesteration.logoutLink.getText().contains("Log out"));

	}}



