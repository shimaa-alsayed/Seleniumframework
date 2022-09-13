package test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePageClass;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserRegisterationTestCase extends TestBaseClass {

	HomePageClass homeObject;
	UserRegisterationPage ObjectRegesteration;
	LoginPage loginObject;

	@Test(priority = 1)
	public void userregesterationsucessfully ()
	{
		// new object driver from class HomePageClass
		homeObject = new HomePageClass (driver);
		homeObject.OpenRegisterationPage();

		ObjectRegesteration = new  UserRegisterationPage(driver);
		ObjectRegesteration.userRegisteration("shimaa", "Elsayed", "rtbvgs@gmail.com", "127750");
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
		loginObject.userlogin("rtbvgs@gmail.com", "127750");
		Thread.sleep(5000);
		Assert.assertTrue(ObjectRegesteration.logoutLink.getText().contains("Log out"));

	}}



