package test;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.HomePageClass;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserRegisterationUsingDDTAndJSON extends TestBaseClass {

	
	
	HomePageClass homeObject;
	UserRegisterationPage ObjectRegesteration;
	LoginPage loginObject;

	@Test(priority = 1)
	public void userregesterationsucessfully () throws FileNotFoundException, IOException, ParseException
	{
		
		
		JsonDataReader jsonReader = new JsonDataReader();
		jsonReader.JsonReader();
		
		// new object driver from class HomePageClass
		homeObject = new HomePageClass (driver);
		homeObject.OpenRegisterationPage();

		ObjectRegesteration = new  UserRegisterationPage(driver);
		ObjectRegesteration.userRegisteration(jsonReader.firstname , jsonReader.lastname, jsonReader.email, jsonReader.password);
		Assert.assertTrue(ObjectRegesteration.sucessmassege.getText().contains("Your registration completed"));
		
		ObjectRegesteration.userlogout();

		homeObject.OpenLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.userlogin(jsonReader.email, jsonReader.password);
		Assert.assertTrue(ObjectRegesteration.logoutLink.getText().contains("Log out"));
		
		ObjectRegesteration.userlogout();

		
		
	}}
	
	



