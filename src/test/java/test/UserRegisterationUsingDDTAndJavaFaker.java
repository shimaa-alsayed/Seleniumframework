package test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePageClass;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserRegisterationUsingDDTAndJavaFaker extends TestBaseClass {

	HomePageClass homeObject;
	UserRegisterationPage ObjectRegesteration;
	LoginPage loginObject;
 Faker  FakeData = new Faker ();
 String firstname = FakeData.name().firstName();
 String lastname = FakeData.name().lastName();
 String email = FakeData.internet().emailAddress();
 String password = FakeData.number().digits(8).toString();


 
 
 
	@Test(priority = 1)
	public void userregesterationsucessfully ()
	{
		// new object driver from class HomePageClass
		homeObject = new HomePageClass (driver);
		homeObject.OpenRegisterationPage();

		ObjectRegesteration = new  UserRegisterationPage(driver);
		ObjectRegesteration.userRegisteration(firstname, lastname, email , password);
		System.out.println(firstname + lastname + email + password);
		
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
		loginObject.userlogin( email , password);
		Thread.sleep(5000);
		Assert.assertTrue(ObjectRegesteration.logoutLink.getText().contains("Log out"));

	}}



