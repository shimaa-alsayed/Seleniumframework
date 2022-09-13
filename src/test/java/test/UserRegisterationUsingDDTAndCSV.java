package test;

import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import pages.HomePageClass;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserRegisterationUsingDDTAndCSV extends TestBaseClass {

	HomePageClass homeObject;
	UserRegisterationPage ObjectRegesteration;
	LoginPage loginObject;
 CSVReader Reader ;
	
	@Test(priority = 1)
	public void userregesterationsucessfully () throws CsvValidationException, IOException
	{
		//get pass for csv 
		
		String CSV_File = System.clearProperty("user.dir")+ "/src/test/java/data/UserData.csv";
		Reader = new CSVReader(new FileReader(CSV_File));
		
		String [] csvcell;
		// while loop tell arive or excuate last value in csv file 
		
		while ((csvcell = Reader.readNext())!= null)
		
		{
			String FirstName = csvcell[0];
			String LastName = csvcell[1];
			String Emaii = csvcell[2];
			String Password = csvcell[3];
			homeObject = new HomePageClass (driver);
			homeObject.OpenRegisterationPage();

			ObjectRegesteration = new  UserRegisterationPage(driver);
			ObjectRegesteration.userRegisteration(FirstName ,LastName,Emaii , Password);
			Assert.assertTrue(ObjectRegesteration.sucessmassege.getText().contains("Your registration completed"));
			ObjectRegesteration.userlogout();
			homeObject.OpenLoginPage();
			loginObject = new LoginPage(driver);
			loginObject.userlogin(Emaii,Password );
			Assert.assertTrue(ObjectRegesteration.logoutLink.getText().contains("Log out"));
			ObjectRegesteration.userlogout();

		}

			
		}
		
		
		// new object driver from class HomePageClass
			
	
	
	
		

	}



