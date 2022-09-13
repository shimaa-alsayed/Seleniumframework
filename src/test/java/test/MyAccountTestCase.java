package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePageClass;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.UserRegisterationPage;

public class MyAccountTestCase extends TestBaseClass{

	 HomePageClass homeObject;
	 UserRegisterationPage ObjectRegesteration;
	 MyAccountPage objectmyaccount;
     LoginPage loginObject;

	 
   String  FName = "shimaa";
   String LName = "Elsayed";
   String mail = "mnkl@gmail.com";
   String oldPassword = "1234567";
   String newPassword = "123456789";

   
   
	
	@Test(priority = 1)
	public void userregesterationsucessfully ()
	{
		// new object driver from class HomePageClass
		homeObject = new HomePageClass (driver);
		homeObject.OpenRegisterationPage();

		ObjectRegesteration = new  UserRegisterationPage(driver);
		ObjectRegesteration.userRegisteration(FName,LName,mail,oldPassword); 
		Assert.assertTrue(ObjectRegesteration.sucessmassege.getText().contains("Your registration completed"));
	}	
	
	@Test(dependsOnMethods = "userregesterationsucessfully")

	public void openmyaccountpage ()
	{

		ObjectRegesteration = new  UserRegisterationPage(driver);
		ObjectRegesteration.openingmyaccountlink();
		
	}	
	@Test(dependsOnMethods = "openmyaccountpage")

	public void accessmyaccountandchangepassword () throws InterruptedException
	{

		objectmyaccount = new  MyAccountPage(driver);
		objectmyaccount.openchangepasswordpage();
		objectmyaccount.changepassword(oldPassword, newPassword);
		Thread.sleep(5000);

	}	
	
	
	@Test(dependsOnMethods = "accessmyaccountandchangepassword")
	public void Registerdusercanlogout ()
	{
		ObjectRegesteration.userlogout();
	}
	@Test(dependsOnMethods = "Registerdusercanlogout")
	public void userloginsucessfully () throws InterruptedException {

		homeObject.OpenLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.userlogin(mail, newPassword);
		Thread.sleep(5000);
		Assert.assertTrue(ObjectRegesteration.logoutLink.getText().contains("Log out"));

	}}
