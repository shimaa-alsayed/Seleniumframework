package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBaseClass{

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "FullName")
	 WebElement Fullnameinquiry ;
	
	@FindBy(id = "Email")
	 WebElement EmailInquiry ;
	
	@FindBy(id = "Enquiry")
	 WebElement enquiry ;
	
	@FindBy(xpath  = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")
	 WebElement submitinquiry ;
	
	@FindBy(css = "div.result")
	public WebElement massegeafterinquery ;
	
	
	public void contactus(String FullName , String Email , String enquirys  )
	
	
	{
		
		settextelementtext(Fullnameinquiry, FullName);
		settextelementtext(EmailInquiry, Email);
		settextelementtext(enquiry, enquirys);
		Clickbutton(submitinquiry);
		
	}
	
	
}
