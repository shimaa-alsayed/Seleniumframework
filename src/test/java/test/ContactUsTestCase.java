package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePageClass;

public class ContactUsTestCase extends TestBaseClass {

	String fullname = "shimaa elsayed ali";
	String email = "sh.e33@yahoo.com";
	String enquirymassege = "massege new massege";
	HomePageClass homeobject;
	ContactUsPage contactusobject;
	@Test
	public void contactwithus () {
		
		homeobject = new HomePageClass (driver);
		homeobject.Opencontactuspage();

		contactusobject = new ContactUsPage (driver);
		contactusobject.contactus(fullname, email, enquirymassege);
		Assert.assertTrue(contactusobject.massegeafterinquery.getText().contains("Your enquiry has been successfully sent to the store owner."));
	}
	
}
